@file:Suppress("unused")

package com.chrynan.precomputedtext.android

/**
 * Creates a [CharSequence] using the provided [textComputer], then alters that [CharSequence] by
 * iterating through the optional [inOrderTextComputers] and providing the previous resulting
 * [CharSequence]. The resulting [CharSequence] is then returned.
 */
@Suppress("REDUNDANT_INLINE_SUSPEND_FUNCTION_TYPE")
suspend inline fun computeTextConsecutively(
    textComputer: suspend () -> CharSequence,
    vararg inOrderTextComputers: suspend (CharSequence) -> CharSequence
): CharSequence {
    var text = textComputer()

    inOrderTextComputers.forEach {
        text = it.invoke(text)
    }

    return text
}

/**
 * A convenience function for creating a compute function from the provided [textComputer] and
 * optional [inOrderTextComputers].
 *
 * @see [computeTextConsecutively]
 */
@Suppress("REDUNDANT_INLINE_SUSPEND_FUNCTION_TYPE")
suspend inline fun consecutiveTextComputer(
    textComputer: suspend () -> CharSequence,
    vararg inOrderTextComputers: suspend (CharSequence) -> CharSequence
): suspend () -> CharSequence {
    var text = textComputer()

    return {
        inOrderTextComputers.forEach {
            text = it.invoke(text)
        }

        text
    }
}
