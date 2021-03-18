@file:Suppress("unused")

package com.chrynan.precomputedtext.android

import android.widget.TextView
import androidx.core.text.PrecomputedTextCompat
import androidx.core.widget.TextViewCompat
import kotlinx.coroutines.*
import java.lang.ref.WeakReference
import com.chrynan.dispatchers.dispatchers

/**
 * Retrieves the [PrecomputedTextCompat.Params] for this [TextView]. This is a convenience property
 * for calling [TextViewCompat.getTextMetricsParams].
 *
 * @see [TextViewCompat.getTextMetricsParams]
 * @see [PrecomputedTextCompat.Params]
 */
val TextView.textMetricParams: PrecomputedTextCompat.Params
    get() = TextViewCompat.getTextMetricsParams(this)

/**
 * Sets the provided pre-computed text] on this [TextView]. This is a convenience function for
 * calling [TextViewCompat.setPrecomputedText].
 */
fun TextView.setPreComputedText(text: PrecomputedTextCompat) {
    TextViewCompat.setPrecomputedText(this, text)
}

/**
 * Creates a [PrecomputedTextCompat] from the provided [params] and [computeText] function. This
 * is a more efficient way to render text on Android. This would be especially useful within a UI
 * list of complex spanned text.
 *
 * @param [params] The [PrecomputedTextCompat.Params] of the [TextView] that this text will be
 * rendered to.
 *
 * @param [computeText] The function that obtains the [CharSequence] that will be rendered to the
 * [TextView] with the provided [params].
 *
 * @param [onBeforeComputeText] A function that is called before [computeText] is called.
 *
 * @param [onAfterComputeText] A function that is called after [computeText] is called and with the
 * resulting [CharSequence] from the [computeText] function.
 *
 * @return [PrecomputedTextCompat] The resulting [PrecomputedTextCompat] instance.
 *
 * @see [PrecomputedTextCompat]
 * @see [PrecomputedTextCompat.Params]
 */
@Suppress("RedundantSuspendModifier", "REDUNDANT_INLINE_SUSPEND_FUNCTION_TYPE")
suspend inline fun preComputeText(
    params: PrecomputedTextCompat.Params,
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    onAfterComputeText: (CharSequence) -> Unit = {}
): PrecomputedTextCompat {
    onBeforeComputeText()

    val text = computeText()

    onAfterComputeText(text)

    return PrecomputedTextCompat.create(text, params)
}

/**
 * Creates a [PrecomputedTextCompat] from the provided [textView] and [computeText] function. This
 * is a more efficient way to render text on Android. This would be especially useful within a UI
 * list of complex spanned text.
 *
 * @param [textView] The [TextView] that this text will be rendered to. This is needed to obtain
 * the [PrecomputedTextCompat.Params] for the [TextView].
 *
 * @param [computeText] The function that obtains the [CharSequence] that will be rendered to the
 * [textView].
 *
 * @param [onBeforeComputeText] A function that is called before [computeText] is called.
 *
 * @param [onAfterComputeText] A function that is called after [computeText] is called and with the
 * resulting [CharSequence] from the [computeText] function.
 *
 * @return [PrecomputedTextCompat] The resulting [PrecomputedTextCompat] instance.
 *
 * @see [PrecomputedTextCompat]
 */
@Suppress("RedundantSuspendModifier", "REDUNDANT_INLINE_SUSPEND_FUNCTION_TYPE")
suspend inline fun preComputeText(
    textView: TextView,
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    onAfterComputeText: (CharSequence) -> Unit = {}
): PrecomputedTextCompat {
    val params = TextViewCompat.getTextMetricsParams(textView)

    onBeforeComputeText()

    val text = computeText()

    onAfterComputeText(text)

    return PrecomputedTextCompat.create(text, params)
}

/**
 * A convenience function for [preComputeText] where the [TextView] used is [this] [TextView].
 *
 * @see [preComputeText]
 */
@Suppress("REDUNDANT_INLINE_SUSPEND_FUNCTION_TYPE")
@JvmName("preComputeTextForTextView")
suspend inline fun TextView.preComputeText(
    computeText: suspend () -> CharSequence,
    onBeforeComputeText: () -> Unit = {},
    onAfterComputeText: (CharSequence) -> Unit = {}
): PrecomputedTextCompat = preComputeText(
    textView = this,
    computeText = computeText,
    onBeforeComputeText = onBeforeComputeText,
    onAfterComputeText = onAfterComputeText
)

/**
 * Pre-computes the text from the [computeText] function and renders it to the [textView]
 * asynchronously using the provided [coroutineScope], [calculateDispatcher], and
 * [renderDispatcher] parameters. If the [params] parameter is not null, then it will use that to
 * pre-compute the text. If the [params] parameter is null, then it will use the [textView] to
 * derive the [PrecomputedTextCompat.Params] and pre-compute the text.
 *
 * @return [Job] The Kotlin Coroutine [Job] that is being performed that computes the text and
 * renders it.
 *
 * @see [preComputeText]
 */
inline fun preComputeTextAndRender(
    textView: TextView,
    params: PrecomputedTextCompat.Params? = null,
    crossinline computeText: suspend () -> CharSequence,
    crossinline onBeforeComputeText: () -> Unit = {},
    crossinline onAfterComputeText: (CharSequence) -> Unit = {},
    crossinline onBeforeRenderText: (CharSequence) -> Unit = {},
    crossinline onAfterRenderText: (CharSequence) -> Unit = {},
    coroutineScope: CoroutineScope,
    calculateDispatcher: CoroutineDispatcher = dispatchers.io,
    renderDispatcher: CoroutineDispatcher = dispatchers.main
): Job {
    val textViewRef = WeakReference(textView)

    return coroutineScope.launch {
        val preComputedText = withContext(calculateDispatcher) {
            if (params != null) {
                preComputeText(
                    params = params,
                    computeText = computeText,
                    onBeforeComputeText = onBeforeComputeText,
                    onAfterComputeText = onAfterComputeText
                )
            } else {
                textViewRef.get()?.let {
                    preComputeText(
                        textView = it,
                        computeText = computeText,
                        onBeforeComputeText = onBeforeComputeText,
                        onAfterComputeText = onAfterComputeText
                    )
                }
            }
        }

        withContext(renderDispatcher) {
            if (preComputedText != null && this.isActive) {
                onBeforeRenderText.invoke(preComputedText)

                textViewRef.get()?.setPreComputedText(preComputedText)

                onAfterRenderText.invoke(preComputedText)
            }
        }
    }
}

/**
 * A convenience function for [preComputeTextAndRender] where the [TextView] used is [this]
 * [TextView]. If the [params] parameter is not null, then it will use that to pre-compute the
 * text. If the [params] parameter is null, then it will use [this] [TextView] to derive the
 * [PrecomputedTextCompat.Params] and pre-compute the text.
 *
 * @see [preComputeTextAndRender]
 */
@JvmName("preComputeTextAndRenderForTextView")
inline fun TextView.preComputeTextAndRender(
    params: PrecomputedTextCompat.Params? = null,
    crossinline computeText: suspend () -> CharSequence,
    crossinline onBeforeComputeText: () -> Unit = {},
    crossinline onAfterComputeText: (CharSequence) -> Unit = {},
    crossinline onBeforeRenderText: (CharSequence) -> Unit = {},
    crossinline onAfterRenderText: (CharSequence) -> Unit = {},
    coroutineScope: CoroutineScope,
    calculateDispatcher: CoroutineDispatcher = dispatchers.io,
    renderDispatcher: CoroutineDispatcher = dispatchers.main
): Job {
    val textViewRef = WeakReference(this)

    return coroutineScope.launch {
        val preComputedText = withContext(calculateDispatcher) {
            if (params != null) {
                preComputeText(
                    params = params,
                    computeText = computeText,
                    onBeforeComputeText = onBeforeComputeText,
                    onAfterComputeText = onAfterComputeText
                )
            } else {
                textViewRef.get()?.let {
                    preComputeText(
                        textView = it,
                        computeText = computeText,
                        onBeforeComputeText = onBeforeComputeText,
                        onAfterComputeText = onAfterComputeText
                    )
                }
            }
        }

        withContext(renderDispatcher) {
            if (preComputedText != null && this.isActive) {
                onBeforeRenderText.invoke(preComputedText)

                textViewRef.get()?.setPreComputedText(preComputedText)

                onAfterRenderText.invoke(preComputedText)
            }
        }
    }
}
