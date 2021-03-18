@file:Suppress("unused")

package com.chrynan.precomputedtext.android

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*

/**
 * A sealed class that indicates an approach to flat-mapping a [Flow]. Each approach determines how
 * the upstream and downstream behaves. The available strategies are [Latest], [Merge], and
 * [Concat].
 */
@FlowPreview
sealed class FlatMapStrategy {

    /**
     * Equivalent to the [Flow.flatMapLatest] function.
     *
     * @see [flatMapLatest]
     */
    object Latest : FlatMapStrategy()

    /**
     * Equivalent to the [Flow.flatMapMerge] function.
     *
     * @property [limit] The amount of concurrently running flat-mapped [Flow]s. The default value
     * is set to [DEFAULT_CONCURRENCY].
     *
     * @see [flatMapMerge]
     */
    data class Merge(val limit: Int = DEFAULT_CONCURRENCY) : FlatMapStrategy()

    /**
     * Equivalent to the [Flow.flatMapConcat] function.
     *
     * @see [flatMapConcat]
     */
    object Concat : FlatMapStrategy()
}

/**
 * Performs a flat-map on this [Flow] of [T] to convert it to a [Flow] of [R] using the provided
 * [strategy]. The [strategy] defaults to [FlatMapStrategy.Latest].
 *
 * @see [FlatMapStrategy]
 * @see [flatMapLatest]
 * @see [flatMapConcat]
 * @see [flatMapMerge]
 */
@FlowPreview
@ExperimentalCoroutinesApi
inline fun <T, R> Flow<T>.flatMap(
    strategy: FlatMapStrategy = FlatMapStrategy.Latest,
    crossinline transform: suspend (value: T) -> Flow<R>
): Flow<R> =
    when (strategy) {
        is FlatMapStrategy.Latest -> flatMapLatest(transform)
        is FlatMapStrategy.Concat -> flatMapConcat { transform.invoke(it) }
        is FlatMapStrategy.Merge -> flatMapMerge(concurrency = strategy.limit) { transform.invoke(it) }
    }
