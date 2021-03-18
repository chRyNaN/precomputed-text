# precomputed-text

A convenient Kotlin Coroutine wrapper around Android [PrecomputedTextCompat](https://developer.android.com/reference/androidx/core/text/PrecomputedTextCompat). <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chrynan/precomputed-text">

```kotlin
preComputeText(textView = textView, computeText = { textGenerator.generate() })
```

## Using the library

### Getting `PrecomputedTextCompat.Params` from a `TextView`

```kotlin
textView.textMetricParams
```

### Setting `PrecomputedTextCompat` text to a `TextView`

```kotlin
textView.setPreComputedText(precomputedTextCompat)
```

### Pre-computing text for a `TextView`

```kotlin
myCoroutineScope.launch {
    val text = preComputeText(textView = textView, computeText = { ... })

    withContext(dispatchers.main) {
        textView.setPreComputedText(text)
    }
}
```

### Pre-computing and rendering text for a `TextView` in a single call

```kotlin
preComputeTextAndRender(
    textView = textView, // Or params = textView.textMetricParams
    computeText = { ... },
    coroutineScope = myCoroutineScope
)
```

### Using Kotlin Coroutine Flows

```kotlin
flowOfPreComputedText(
    params = textView.textMetricParams, // Or textView = textView
    computeText = { ... })
    .flowOn(dispatchers.io)
    .renderToTextView(textView)
    .flowOn(dispatchers.main)
    .launchIn(myCoroutineScope)
```

### Making multiple text generation passes and emitting the progress

```kotlin
flowOfConcurrentPreComputedText(
    textView = textView, // Or params = textView.textMetricParams
    computeText = { ... }, // The first pass to generate the text
    inOrderTextComputers = listOf( ... )) // Consecutive passes to generate the text
    .flowOn(dispatchers.io)
    .renderToTextView(textView)
    .flowOn(dispatchers.main)
    .launchIn(myCoroutineScope)
```

## Documentation

Have a look at the [docs folder](docs) for documentation and more information about usage.

## Building the library

The library is provided through [Repsy](https://repsy.io). Checkout the [releases page](https://github.com/chRyNaN/precomputed-text/releases) to get the latest version. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chrynan/precomputed-text">

### Repository

```groovy
repositories {
    maven { url "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

```groovy
implementation "com.chrynan.precomputedtext:precomputedtext-android:0.1.0-release"
```

## License

```
Copyright 2021 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
