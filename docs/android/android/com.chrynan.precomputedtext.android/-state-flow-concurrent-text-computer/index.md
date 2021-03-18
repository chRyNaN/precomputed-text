//[android](../../../index.md)/[com.chrynan.precomputedtext.android](../index.md)/[StateFlowConcurrentTextComputer](index.md)



# StateFlowConcurrentTextComputer  
 [androidJvm] class [StateFlowConcurrentTextComputer](index.md)(**textComputer**: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), **inOrderTextComputers**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<suspend ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)>, **stateFlow**: MutableStateFlow<[CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)?>) : [ConcurrentTextComputer](../-concurrent-text-computer/index.md)

An implementation of [ConcurrentTextComputer](../-concurrent-text-computer/index.md) that uses a MutableStateFlow and exposes its emitted values via the [changes](changes.md) function.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android/StateFlowConcurrentTextComputer/StateFlowConcurrentTextComputer/#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlinx.coroutines.flow.MutableStateFlow[kotlin.CharSequence?]/PointingToDeclaration/"></a>[StateFlowConcurrentTextComputer](-state-flow-concurrent-text-computer.md)| <a name="com.chrynan.precomputedtext.android/StateFlowConcurrentTextComputer/StateFlowConcurrentTextComputer/#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.collections.List[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]#kotlinx.coroutines.flow.MutableStateFlow[kotlin.CharSequence?]/PointingToDeclaration/"></a> [androidJvm] fun [StateFlowConcurrentTextComputer](-state-flow-concurrent-text-computer.md)(textComputer: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), inOrderTextComputers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<suspend ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)> = emptyList(), stateFlow: MutableStateFlow<[CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)?> = MutableStateFlow(null))   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.precomputedtext.android/StateFlowConcurrentTextComputer/changes/#/PointingToDeclaration/"></a>[changes](changes.md)| <a name="com.chrynan.precomputedtext.android/StateFlowConcurrentTextComputer/changes/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [changes](changes.md)(): StateFlow<[CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)?>  <br><br><br>|
| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer/invoke/#/PointingToDeclaration/"></a>[invoke](../-concurrent-text-computer/invoke.md)| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer/invoke/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>suspend operator fun [invoke](../-concurrent-text-computer/invoke.md)()  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.precomputedtext.android/StateFlowConcurrentTextComputer/emitter/#/PointingToDeclaration/"></a>[emitter](emitter.md)| <a name="com.chrynan.precomputedtext.android/StateFlowConcurrentTextComputer/emitter/#/PointingToDeclaration/"></a> [androidJvm] open override val [emitter](emitter.md): suspend ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)   <br>|

