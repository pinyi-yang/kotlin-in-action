# Chapter 2

## Functions
### Statement and Expressions
An expression has value, which can be used as part of another expression.
Statement is always top-level and doesn't have value

| | Kotlin | Java |
|---|---|---|
| Statement | Assignment | Control Structures |
| Expression | Control Structures (except loop) | Assignment  |

* Function: 
  * block body vs expression body
  * type inference

## Variable
```kotlin
// Immutable, can assign only once
val a = 14
val b: Int

// Mutable
var c = 15
c = 16
```

Immutable (references, objects and functions). Reference doesn't change but values may.

Type is always the same for both `val` and `var`. Type conversion is necessary to change type.

## String Template
```kotlin
println("Hello, $name!")
println("Hello, ${args[0]}!")
```

## Classes and Properties
Java: field + accessor methods = property
Kotlin: property -> auto delcared field and accessor

**Custom Accessor**
