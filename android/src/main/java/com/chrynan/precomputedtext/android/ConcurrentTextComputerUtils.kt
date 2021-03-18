@file:Suppress("unused")

package com.chrynan.precomputedtext.android

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * A class that can compute text with the [textComputer] and then take that text and possible alter
 * it by providing it to the first [inOrderTextComputers] and each result passed to the next
 * [inOrderTextComputers]. Each time a text is computed, it is emitted with the [emitter] function.
 *
 * Note that this is different than the [computeTextConsecutively] and related utilities as that
 * would iterate through all of the functions and only emit the ending result. Whereas, this class
 * will continuously emit results after each text computation.
 *
 * @see [computeTextConsecutively]
 */
abstract class ConcurrentTextComputer {

    protected abstract val textComputer: suspend () -> CharSequence
    protected abstract val inOrderTextComputers: List<suspend (CharSequence) -> CharSequence>

    abstract val emitter: suspend (CharSequence) -> Unit

    suspend operator fun invoke() {
        var text = textComputer.invoke()

        emitter.invoke(text)

        inOrderTextComputers.forEach {
            text = it.invoke(text)
            emitter.invoke(text)
        }
    }
}

/**
 * An implementation of [ConcurrentTextComputer] that uses a [MutableStateFlow] and exposes its
 * emitted values via the [changes] function.
 */
class StateFlowConcurrentTextComputer(
    override val textComputer: suspend () -> CharSequence,
    override val inOrderTextComputers: List<suspend (CharSequence) -> CharSequence> = emptyList(),
    private val stateFlow: MutableStateFlow<CharSequence?> = MutableStateFlow(null)
) : ConcurrentTextComputer() {

    override val emitter: suspend (CharSequence) -> Unit = { stateFlow.value = it }

    fun changes(): StateFlow<CharSequence?> = stateFlow
}
