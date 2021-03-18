//[android](../../index.md)/[com.chrynan.precomputedtext.core](index.md)/[flowOfPreComputedTextAfterRender](flow-of-pre-computed-text-after-render.md)



# flowOfPreComputedTextAfterRender  
[androidJvm]  
Content  
fun [flowOfPreComputedTextAfterRender](flow-of-pre-computed-text-after-render.md)(textView: [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html), params: [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html)? = null, computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onBeforeRenderText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterRenderText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, calculateDispatcher: CoroutineDispatcher = dispatchers.io, renderDispatcher: CoroutineDispatcher = dispatchers.main): Flow<[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)>  
More info  


Retrieves a Flow of [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) for the provided [textView](flow-of-pre-computed-text-after-render.md) using the provided [computeText](flow-of-pre-computed-text-after-render.md) function to generate the text. The returned Flow of [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) are emitted after it has already been rendered to the provided [textView](flow-of-pre-computed-text-after-render.md).

  



