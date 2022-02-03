# Chapter 1

## Philosophy of Kotlin
* Pragmatic
* Concise
* Safe
  * remove `NullPointerException`: `String?`
  * remove `ClassCastException`: `is`
```kotlin
val s: String? = null
val s2: String = ""

if (value is String)
    println(value.toUpperCase())
```
* Interoperable