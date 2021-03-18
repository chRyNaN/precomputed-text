//[android](../../index.md)/[com.chrynan.precomputedtext.android](index.md)/[preComputeTextAndRender](pre-compute-text-and-render.md)



# preComputeTextAndRender  
[androidJvm]  
Content  
inline fun [preComputeTextAndRender](pre-compute-text-and-render.md)(textView: [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html), params: [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html)? = null, crossinline computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), crossinline onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, crossinline onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, crossinline onBeforeRenderText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, crossinline onAfterRenderText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, coroutineScope: CoroutineScope, calculateDispatcher: CoroutineDispatcher = dispatchers.io, renderDispatcher: CoroutineDispatcher = dispatchers.main): Job  
More info  


Pre-computes the text from the [computeText](pre-compute-text-and-render.md) function and renders it to the [textView](pre-compute-text-and-render.md) asynchronously using the provided [coroutineScope](pre-compute-text-and-render.md), [calculateDispatcher](pre-compute-text-and-render.md), and [renderDispatcher](pre-compute-text-and-render.md) parameters. If the [params](pre-compute-text-and-render.md) parameter is not null, then it will use that to pre-compute the text. If the [params](pre-compute-text-and-render.md) parameter is null, then it will use the [textView](pre-compute-text-and-render.md) to derive the [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html) and pre-compute the text.



#### Return  


Job The Kotlin Coroutine Job that is being performed that computes the text and renders it.



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//preComputeTextAndRender/#android.widget.TextView#androidx.core.text.PrecomputedTextCompat.Params?#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlinx.coroutines.CoroutineScope#kotlinx.coroutines.CoroutineDispatcher#kotlinx.coroutines.CoroutineDispatcher/PointingToDeclaration/"></a>[preComputeText](pre-compute-text.md)| <a name="com.chrynan.precomputedtext.android//preComputeTextAndRender/#android.widget.TextView#androidx.core.text.PrecomputedTextCompat.Params?#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlinx.coroutines.CoroutineScope#kotlinx.coroutines.CoroutineDispatcher#kotlinx.coroutines.CoroutineDispatcher/PointingToDeclaration/"></a>|
  
  


[androidJvm]  
Content  
@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = preComputeTextAndRenderForTextView)  
  
inline fun [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html).[preComputeTextAndRender](pre-compute-text-and-render.md)(params: [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html)? = null, crossinline computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), crossinline onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, crossinline onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, crossinline onBeforeRenderText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, crossinline onAfterRenderText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, coroutineScope: CoroutineScope, calculateDispatcher: CoroutineDispatcher = dispatchers.io, renderDispatcher: CoroutineDispatcher = dispatchers.main): Job  
More info  


A convenience function for [preComputeTextAndRender](pre-compute-text-and-render.md) where the [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) used is [this](https://developer.android.com/reference/kotlin/android/widget/TextView.html). If the [params](pre-compute-text-and-render.md) parameter is not null, then it will use that to pre-compute the text. If the [params](pre-compute-text-and-render.md) parameter is null, then it will use [this](https://developer.android.com/reference/kotlin/android/widget/TextView.html) to derive the [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html) and pre-compute the text.



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//preComputeTextAndRender/android.widget.TextView#androidx.core.text.PrecomputedTextCompat.Params?#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlinx.coroutines.CoroutineScope#kotlinx.coroutines.CoroutineDispatcher#kotlinx.coroutines.CoroutineDispatcher/PointingToDeclaration/"></a>[preComputeTextAndRender](pre-compute-text-and-render.md)| <a name="com.chrynan.precomputedtext.android//preComputeTextAndRender/android.widget.TextView#androidx.core.text.PrecomputedTextCompat.Params?#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]#kotlinx.coroutines.CoroutineScope#kotlinx.coroutines.CoroutineDispatcher#kotlinx.coroutines.CoroutineDispatcher/PointingToDeclaration/"></a>|
  
  



