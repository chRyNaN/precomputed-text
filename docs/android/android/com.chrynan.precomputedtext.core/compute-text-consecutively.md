//[android](../../index.md)/[com.chrynan.precomputedtext.core](index.md)/[computeTextConsecutively](compute-text-consecutively.md)



# computeTextConsecutively  
[androidJvm]  
Content  
inline suspend fun [computeTextConsecutively](compute-text-consecutively.md)(textComputer: suspend () -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), vararg inOrderTextComputers: suspend ([CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) -> [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  
More info  


Creates a [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html) using the provided [textComputer](compute-text-consecutively.md), then alters that [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html) by iterating through the optional [inOrderTextComputers](compute-text-consecutively.md) and providing the previous resulting [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html). The resulting [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html) is then returned.

  



