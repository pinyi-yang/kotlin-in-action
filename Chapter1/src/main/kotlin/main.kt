data class Person(val name: String, val age: Int? = null) // data class

/**
 * Top-level function
 */
fun main(args: Array<String>) {
    val persons = listOf(
        Person("Alice"),
        Person("Bob", age = 29)
    )

    // lambda & Elvis
    val oldest = persons.maxByOrNull { it.age ?: 0 }

    // String template
    println("The oldest is: $oldest")
}