//[android](../../../index.md)/[com.chrynan.precomputedtext.android](../index.md)/[ConcurrentTextComputer](index.md)



# ConcurrentTextComputer  
 [androidJvm] abstract class [ConcurrentTextComputer](index.md)

A class that can compute text with the [textComputer](../../../../android/com.chrynan.precomputedtext.android/-concurrent-text-computer/text-computer.md) and then take that text and possible alter it by providing it to the first [inOrderTextComputers](../../../../android/com.chrynan.precomputedtext.android/-concurrent-text-computer/in-order-text-computers.md) and each result passed to the next [inOrderTextComputers](../../../../android/com.chrynan.precomputedtext.android/-concurrent-text-computer/in-order-text-computers.md). Each time a text is computed, it is emitted with the [emitter](emitter.md) function.



Note that this is different than the [computeTextConsecutively](../compute-text-consecutively.md) and related utilities as that would iterate through all of the functions and only emit the ending result. Whereas, this class will continuously emit results after each text computation.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer///PointingToDeclaration/"></a>[computeTextConsecutively](../compute-text-consecutively.md)| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer/ConcurrentTextComputer/#/PointingToDeclaration/"></a>[ConcurrentTextComputer](-concurrent-text-computer.md)| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer/ConcurrentTextComputer/#/PointingToDeclaration/"></a> [androidJvm] fun [ConcurrentTextComputer](-concurrent-text-computer.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer/invoke/#/PointingToDeclaration/"></a>[invoke](invoke.md)| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer/invoke/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>suspend operator fun [invoke](invoke.md)()  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer/emitter/#/PointingToDeclaration/"></a>[emitter](emitter.md)| <a name="com.chrynan.precomputedtext.android/ConcurrentTextComputer/emitter/#/PointingToDeclaration/"></a> [androidJvm] abstract val [emitter](emitter.md): suspend ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.precomputedtext.android/StateFlowConcurrentTextComputer///PointingToDeclaration/"></a>[StateFlowConcurrentTextComputer](../-state-flow-concurrent-text-computer/index.md)|

