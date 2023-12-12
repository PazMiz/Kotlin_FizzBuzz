actual fun getFizzBuzzValue(i: Int): String {
    // Your JVM implementation here
    // e.g., using the shared logic from the original Kotlin code
    return when {
        i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> "This number is not divisible by 3 or 5"
    }
}

actual fun getColoredFizzBuzzValue(i: Int): String {
    // Your JVM implementation here
    // e.g., using the shared logic from the original Kotlin code
    val fizzBuzzMessage = getFizzBuzzValue(i)

    return when {
        fizzBuzzMessage == "FizzBuzz" -> "$i is FizzBuzz"
        fizzBuzzMessage == "Fizz" -> "$i is Fizz"
        fizzBuzzMessage == "Buzz" -> "$i is Buzz"
        else -> "$i is $fizzBuzzMessage"
    }
}
