//[android](../../index.md)/[com.chrynan.precomputedtext.android](index.md)/[flowOfPreComputedText](flow-of-pre-computed-text.md)



# flowOfPreComputedText  
[androidJvm]  
Content  
fun [flowOfPreComputedText](flow-of-pre-computed-text.md)(textView: [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html), computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): Flow<[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)>  
More info  


Retrieves a Flow of [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) for the provided [textView](flow-of-pre-computed-text.md) using the provided [computeText](flow-of-pre-computed-text.md) function to generate the text.

  


[androidJvm]  
Content  
fun [flowOfPreComputedText](flow-of-pre-computed-text.md)(params: [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html), computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): Flow<[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)>  
More info  


Retrieves a Flow of [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) for the provided [params](flow-of-pre-computed-text.md) of a [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) using the provided [computeText](flow-of-pre-computed-text.md) function to generate the text.

  



