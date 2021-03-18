//[android](../../index.md)/[com.chrynan.precomputedtext.android](index.md)/[consecutiveTextComputer](consecutive-text-computer.md)



# consecutiveTextComputer  
[androidJvm]  
Content  
inline suspend fun [consecutiveTextComputer](consecutive-text-computer.md)(textComputer: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), vararg inOrderTextComputers: suspend ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)): suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  
More info  


A convenience function for creating a compute function from the provided [textComputer](consecutive-text-computer.md) and optional [inOrderTextComputers](consecutive-text-computer.md).



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.android//consecutiveTextComputer/#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Array[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]/PointingToDeclaration/"></a>[computeTextConsecutively](compute-text-consecutively.md)| <a name="com.chrynan.precomputedtext.android//consecutiveTextComputer/#kotlin.coroutines.SuspendFunction0[kotlin.CharSequence]#kotlin.Array[kotlin.coroutines.SuspendFunction1[kotlin.CharSequence,kotlin.CharSequence]]/PointingToDeclaration/"></a>|
  
  



