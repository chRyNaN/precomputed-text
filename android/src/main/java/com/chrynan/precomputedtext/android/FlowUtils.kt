@file:Suppress("unused")

package com.chrynan.precomputedtext.android

import android.widget.TextView
import androidx.core.text.PrecomputedTextCompat
import com.chrynan.dispatchers.dispatchers
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.*

/**
 * Retrieves a [Flow] of [PrecomputedTextCompat.Params] from this [Flow] of [TextView]s.
 */
fun Flow<TextView>.mapToTextMetricParams(): Flow<PrecomputedTextCompat.Params> =
    map { it.textMetricParams }

/**
 * Pre-computes text for this [Flow] of [PrecomputedTextCompat.Params] using the provided
 * [computeText] function. This function returns a [Flow] of [PrecomputedTextCompat].
 */
fun Flow<PrecomputedTextCompat.Params>.preComputeText(
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    onAfterComputeText: (CharSequence) -> Unit = {}
): Flow<PrecomputedTextCompat> = map {
    preComputeText(
        params = it,
        computeText = computeText,
        onBeforeComputeText = onBeforeComputeText,
        onAfterComputeText = onAfterComputeText
    )
}

/**
 * Renders this [Flow] of [PrecomputedTextCompat] to the provided [textView] and returns a [Flow]
 * of the same [PrecomputedTextCompat] items.
 */
fun Flow<PrecomputedTextCompat>.renderToTextView(
    textView: TextView,
    onBeforeRenderText: (CharSequence) -> Unit = {},
    onAfterRenderText: (CharSequence) -> Unit = {},
): Flow<PrecomputedTextCompat> = onEach {
    onBeforeRenderText.invoke(it)

    textView.setPreComputedText(it)

    onAfterRenderText.invoke(it)
}

/**
 * Retrieves a [Flow] of [PrecomputedTextCompat] for the provided [textView] using the provided
 * [computeText] function to generate the text.
 */
fun flowOfPreComputedText(
    textView: TextView,
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    onAfterComputeText: (CharSequence) -> Unit = {}
): Flow<PrecomputedTextCompat> = flow {
    val text = preComputeText(
        textView = textView,
        computeText = computeText,
        onBeforeComputeText = onBeforeComputeText,
        onAfterComputeText = onAfterComputeText
    )

    emit(text)
}

/**
 * Retrieves a [Flow] of [PrecomputedTextCompat] for the provided [params] of a [TextView] using
 * the provided [computeText] function to generate the text.
 */
fun flowOfPreComputedText(
    params: PrecomputedTextCompat.Params,
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    onAfterComputeText: (CharSequence) -> Unit = {}
): Flow<PrecomputedTextCompat> = flow {
    val text = preComputeText(
        params = params,
        computeText = computeText,
        onBeforeComputeText = onBeforeComputeText,
        onAfterComputeText = onAfterComputeText
    )

    emit(text)
}

/**
 * Retrieves a [Flow] of [PrecomputedTextCompat] for the provided [textView] using the provided
 * [computeText] function to generate the text. The returned [Flow] of [PrecomputedTextCompat] are
 * emitted after it has already been rendered to the provided [textView].
 */
fun flowOfPreComputedTextAfterRender(
    textView: TextView,
    params: PrecomputedTextCompat.Params? = null,
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    onAfterComputeText: (CharSequence) -> Unit = {},
    onBeforeRenderText: (CharSequence) -> Unit = {},
    onAfterRenderText: (CharSequence) -> Unit = {},
    calculateDispatcher: CoroutineDispatcher = dispatchers.io,
    renderDispatcher: CoroutineDispatcher = dispatchers.main
): Flow<PrecomputedTextCompat> =
    if (params != null) {
        flowOfPreComputedText(
            params = params,
            computeText = computeText,
            onBeforeComputeText = onBeforeComputeText,
            onAfterComputeText = onAfterComputeText
        )
    } else {
        flowOfPreComputedText(
            textView = textView,
            computeText = computeText,
            onBeforeComputeText = onBeforeComputeText,
            onAfterComputeText = onAfterComputeText
        )
    }
        .flowOn(calculateDispatcher)
        .renderToTextView(
            textView = textView,
            onBeforeRenderText = onBeforeRenderText,
            onAfterRenderText = onAfterRenderText
        )
        .flowOn(renderDispatcher)

/**
 * Retrieves a [Flow] of [PrecomputedTextCompat] for the provided [textView] using the provided
 * [computeText] function to generate the initial text that will be pre-computed and emitted in the
 * resulting [Flow] and the provided [inOrderTextComputers] to alter each resulting text and emit
 * the resulting pre-computed text from that result in the [Flow].
 *
 * This function provides a way to show the text progress in a [TextView] if it needs multiple
 * passes to generate the full result.
 *
 * @see [ConcurrentTextComputer]
 * @see [StateFlowConcurrentTextComputer]
 */
fun flowOfConcurrentPreComputedText(
    textView: TextView,
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    inOrderTextComputers: List<suspend (CharSequence) -> CharSequence> = emptyList(),
    onAfterComputeText: (CharSequence) -> Unit = {}
): Flow<PrecomputedTextCompat> {
    val concurrentTextComputer = StateFlowConcurrentTextComputer(
        textComputer = computeText,
        inOrderTextComputers = inOrderTextComputers
    )

    return concurrentTextComputer.changes()
        .onSubscription { concurrentTextComputer.invoke() }
        .filterNotNull()
        .map {
            preComputeText(
                textView = textView,
                computeText = { it },
                onBeforeComputeText = onBeforeComputeText,
                onAfterComputeText = onAfterComputeText
            )
        }
}

/**
 * Retrieves a [Flow] of [PrecomputedTextCompat] for the provided [params] for the [TextView] using
 * the provided [computeText] function to generate the initial text that will be pre-computed and
 * emitted in the resulting [Flow] and the provided [inOrderTextComputers] to alter each resulting
 * text and emit the resulting pre-computed text from that result in the [Flow].
 *
 * This function provides a way to show the text progress in a [TextView] if it needs multiple
 * passes to generate the full result.
 *
 * @see [ConcurrentTextComputer]
 * @see [StateFlowConcurrentTextComputer]
 */
fun flowOfConcurrentPreComputedText(
    params: PrecomputedTextCompat.Params,
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    inOrderTextComputers: List<suspend (CharSequence) -> CharSequence> = emptyList(),
    onAfterComputeText: (CharSequence) -> Unit = {}
): Flow<PrecomputedTextCompat> {
    val concurrentTextComputer = StateFlowConcurrentTextComputer(
        textComputer = computeText,
        inOrderTextComputers = inOrderTextComputers
    )

    return concurrentTextComputer.changes()
        .onSubscription { concurrentTextComputer.invoke() }
        .filterNotNull()
        .map {
            preComputeText(
                params = params,
                computeText = { it },
                onBeforeComputeText = onBeforeComputeText,
                onAfterComputeText = onAfterComputeText
            )
        }
}
