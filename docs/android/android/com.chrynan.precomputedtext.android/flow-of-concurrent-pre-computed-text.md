//[android](../../index.md)/[com.chrynan.precomputedtext.android](index.md)/[flowOfConcurrentPreComputedText](flow-of-concurrent-pre-computed-text.md)



# flowOfConcurrentPreComputedText  
[androidJvm]  
Content  
fun [flowOfConcurrentPreComputedText](flow-of-concurrent-pre-computed-text.md)(textView: [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html), computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, inOrderTextComputers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<suspend ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)> = emptyList(), onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): Flow<[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)>  
More info  


Retrieves a Flow of [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) for the provided [textView](flow-of-concurrent-pre-computed-text.md) using the provided [computeText](flow-of-concurrent-pre-computed-text.md) function to generate the initial text that will be pre-computed and emitted in the resulting Flow and the provided [inOrderTextComputers](flow-of-concurrent-pre-computed-text.md) to alter each resulting text and emit the resulting pre-computed text from that result in the Flow.



This function provides a way to show the text progress in a [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) if it needs multiple passes to generate the full result.



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//flowOfConcurrentPreComputedText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>[com.chrynan.precomputedtext.android.ConcurrentTextComputer](-concurrent-text-computer/index.md)| <a name="com.chrynan.precomputedtext.android//flowOfConcurrentPreComputedText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>|
| <a name="com.chrynan.precomputedtext.android//flowOfConcurrentPreComputedText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>[com.chrynan.precomputedtext.android.StateFlowConcurrentTextComputer](-state-flow-concurrent-text-computer/index.md)| <a name="com.chrynan.precomputedtext.android//flowOfConcurrentPreComputedText/#android.widget.TextView#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>|
  
  


[androidJvm]  
Content  
fun [flowOfConcurrentPreComputedText](flow-of-concurrent-pre-computed-text.md)(params: [PrecomputedTextCompat.Params](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.Params.html), computeText: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), onBeforeComputeText: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}, inOrderTextComputers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<suspend ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)> = emptyList(), onAfterComputeText: ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {}): Flow<[PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html)>  
More info  


Retrieves a Flow of [PrecomputedTextCompat](https://developer.android.com/reference/kotlin/androidx/core/text/PrecomputedTextCompat.html) for the provided [params](flow-of-concurrent-pre-computed-text.md) for the [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) using the provided [computeText](flow-of-concurrent-pre-computed-text.md) function to generate the initial text that will be pre-computed and emitted in the resulting Flow and the provided [inOrderTextComputers](flow-of-concurrent-pre-computed-text.md) to alter each resulting text and emit the resulting pre-computed text from that result in the Flow.



This function provides a way to show the text progress in a [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html) if it needs multiple passes to generate the full result.



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//flowOfConcurrentPreComputedText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>[com.chrynan.precomputedtext.android.ConcurrentTextComputer](-concurrent-text-computer/index.md)| <a name="com.chrynan.precomputedtext.android//flowOfConcurrentPreComputedText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>|
| <a name="com.chrynan.precomputedtext.android//flowOfConcurrentPreComputedText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>[com.chrynan.precomputedtext.android.StateFlowConcurrentTextComputer](-state-flow-concurrent-text-computer/index.md)| <a name="com.chrynan.precomputedtext.android//flowOfConcurrentPreComputedText/#androidx.core.text.PrecomputedTextCompat.Params#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Function0[kotlin.Unit]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlin.Function1[kotlin.CharSequence,kotlin.Unit]/PointingToDeclaration/"></a>|
  
  



