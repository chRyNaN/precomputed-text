//[android](../../index.md)/[com.chrynan.precomputedtext.core](index.md)/[flatMap](flat-map.md)



# flatMap  
[androidJvm]  
Content  
@FlowPreview()  
@ExperimentalCoroutinesApi()  
  
inline fun <[T](flat-map.md), [R](flat-map.md)> Flow<[T](flat-map.md)>.[flatMap](flat-map.md)(strategy: [FlatMapStrategy](-flat-map-strategy/index.md) = FlatMapStrategy.Latest, crossinline transform: suspend ([T](flat-map.md)) -> Flow<[R](flat-map.md)>): Flow<[R](flat-map.md)>  
More info  


Performs a flat-map on this Flow of [T](flat-map.md) to convert it to a Flow of [R](flat-map.md) using the provided [strategy](flat-map.md). The [strategy](flat-map.md) defaults to [FlatMapStrategy.Latest](-flat-map-strategy/-latest/index.md).



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.chrynan.precomputedtext.core//flatMap/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.precomputedtext.core.FlatMapStrategy#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[com.chrynan.precomputedtext.core.FlatMapStrategy](-flat-map-strategy/index.md)| <a name="com.chrynan.precomputedtext.core//flatMap/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.precomputedtext.core.FlatMapStrategy#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>|
| <a name="com.chrynan.precomputedtext.core//flatMap/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.precomputedtext.core.FlatMapStrategy#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>flatMapLatest| <a name="com.chrynan.precomputedtext.core//flatMap/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.precomputedtext.core.FlatMapStrategy#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>|
| <a name="com.chrynan.precomputedtext.core//flatMap/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.precomputedtext.core.FlatMapStrategy#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>flatMapConcat| <a name="com.chrynan.precomputedtext.core//flatMap/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.precomputedtext.core.FlatMapStrategy#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>|
| <a name="com.chrynan.precomputedtext.core//flatMap/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.precomputedtext.core.FlatMapStrategy#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>flatMapMerge| <a name="com.chrynan.precomputedtext.core//flatMap/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.precomputedtext.core.FlatMapStrategy#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>|
  
  



