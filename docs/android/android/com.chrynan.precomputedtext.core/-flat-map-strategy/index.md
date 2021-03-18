//[android](../../../index.md)/[com.chrynan.precomputedtext.core](../index.md)/[FlatMapStrategy](index.md)



# FlatMapStrategy  
 [androidJvm] @FlowPreview()  
  
sealed class [FlatMapStrategy](index.md)

A sealed class that indicates an approach to flat-mapping a Flow. Each approach determines how the upstream and downstream behaves. The available strategies are [Latest](-latest/index.md), [Merge](-merge/index.md), and [Concat](-concat/index.md).

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Concat///PointingToDeclaration/"></a>[Concat](-concat/index.md)| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Concat///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Concat](-concat/index.md) : [FlatMapStrategy](index.md)  <br>More info  <br>Equivalent to the Flow.flatMapConcat function.  <br><br><br>|
| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Latest///PointingToDeclaration/"></a>[Latest](-latest/index.md)| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Latest///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Latest](-latest/index.md) : [FlatMapStrategy](index.md)  <br>More info  <br>Equivalent to the Flow.flatMapLatest function.  <br><br><br>|
| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Merge///PointingToDeclaration/"></a>[Merge](-merge/index.md)| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Merge///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [Merge](-merge/index.md)(**limit**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [FlatMapStrategy](index.md)  <br>More info  <br>Equivalent to the Flow.flatMapMerge function.  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Latest///PointingToDeclaration/"></a>[FlatMapStrategy](-latest/index.md)|
| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Merge///PointingToDeclaration/"></a>[FlatMapStrategy](-merge/index.md)|
| <a name="com.chrynan.precomputedtext.core/FlatMapStrategy.Concat///PointingToDeclaration/"></a>[FlatMapStrategy](-concat/index.md)|

