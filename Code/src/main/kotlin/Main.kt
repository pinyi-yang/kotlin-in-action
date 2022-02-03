fun max(a: Int, b: Int): Int = if (a > b) a else b

class Person(val name: String, var isMarried: Boolean = false)

class Rectangle(val width: Int = 0, val height: Int = 0) {
    val isSquare: Boolean
        get() = width == height
}

fun main(args: Array<String>) {
    println("Hello World!")

    println(max(1,2))

    val bob = Person("Bob")
    println(bob.name);

    val rec1 = Rectangle(3, 5)
    val rec2 = Rectangle(4, 4)
    println("Rec 1 is square: ${rec1.isSquare}")
    println("Rec 2 is square: ${rec2.isSquare}")
}

