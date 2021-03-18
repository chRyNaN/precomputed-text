//[android](../../index.md)/[com.chrynan.precomputedtext.android](index.md)/[preComputeText](pre-compute-text.md)



# preComputeText  
[androidJvm]  
Content  
fun Flow<[PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html)>.[preComputeText](pre-compute-text.md)(computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): Flow<[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)>  
More info  


Pre-computes text for this Flow of [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html) using the provided [computeText](pre-compute-text.md) function. This function returns a Flow of [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html).

  


[androidJvm]  
Content  
inline suspend fun [preComputeText](pre-compute-text.md)(params: [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html), computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)  
More info  


Creates a [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) from the provided [params](pre-compute-text.md) and [computeText](pre-compute-text.md) function. This is a more efficient way to render text on Android. This would be especially useful within a UI list of complex spanned text.



#### Return  


[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) The resulting [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) instance.



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>[androidx.core.text.PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>[androidx.core.text.PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html)| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>params| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a><br><br>The [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html) of the [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) that this text will be rendered to.<br><br>|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>computeText| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a><br><br>The function that obtains the [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html) that will be rendered to the [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) with the provided [params](pre-compute-text.md).<br><br>|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>onBeforeComputeText| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a><br><br>A function that is called before [computeText](pre-compute-text.md) is called.<br><br>|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>onAfterComputeText| <a name="com.chrynan.precomputedtext.android//preComputeText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a><br><br>A function that is called after [computeText](pre-compute-text.md) is called and with the resulting [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html) from the [computeText](pre-compute-text.md) function.<br><br>|
  
  


[androidJvm]  
Content  
inline suspend fun [preComputeText](pre-compute-text.md)(textView: [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html), computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)  
More info  


Creates a [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) from the provided [textView](pre-compute-text.md) and [computeText](pre-compute-text.md) function. This is a more efficient way to render text on Android. This would be especially useful within a UI list of complex spanned text.



#### Return  


[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) The resulting [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) instance.



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>[androidx.core.text.PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>textView| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a><br><br>The [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) that this text will be rendered to. This is needed to obtain the [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html) for the [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html).<br><br>|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>computeText| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a><br><br>The function that obtains the [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html) that will be rendered to the [textView](pre-compute-text.md).<br><br>|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>onBeforeComputeText| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a><br><br>A function that is called before [computeText](pre-compute-text.md) is called.<br><br>|
| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>onAfterComputeText| <a name="com.chrynan.precomputedtext.android//preComputeText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a><br><br>A function that is called after [computeText](pre-compute-text.md) is called and with the resulting [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html) from the [computeText](pre-compute-text.md) function.<br><br>|
  
  


[androidJvm]  
Content  
@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = preComputeTextForTextView)  
  
inline suspend fun [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html).[preComputeText](pre-compute-text.md)(computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)  
More info  


A convenience function for [preComputeText](pre-compute-text.md) where the [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) used is [this](https://developer.android.com/reference/kotlin/android/widget/TextView.html).



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//preComputeText/android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>[preComputeText](pre-compute-text.md)| <a name="com.chrynan.precomputedtext.android//preComputeText/android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>|
  
  



