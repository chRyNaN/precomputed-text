//[android](../../index.md)/[com.chrynan.precomputedtext.core](index.md)/[renderToTextView](render-to-text-view.md)



# renderToTextView  
[androidJvm]  
Content  
fun Flow<[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)>.[renderToTextView](render-to-text-view.md)(textView: [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html), onBeforeRenderText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterRenderText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): Flow<[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)>  
More info  


Renders this Flow of [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) to the provided [textView](render-to-text-view.md) and returns a Flow of the same [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) items.

  



