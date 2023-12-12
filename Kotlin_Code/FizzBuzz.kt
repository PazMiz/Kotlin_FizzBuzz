fun main() {
    println("FizzBuzz Console App")

    val start = readInt("Enter the starting number: ")
    val end = readInt("Enter the ending number: ")

    // Build the FizzBuzz output and print it
    val fizzBuzzOutput = buildFizzBuzzOutput(start, end)
    println(fizzBuzzOutput)
}

fun buildFizzBuzzOutput(start: Int, end: Int): String {
    val stringBuilder = StringBuilder()

    for (i in start..end) {
        // Append the FizzBuzz value for the current number with color and input information
        stringBuilder.append("${getColoredFizzBuzzValue(i)}\n")
    }

    return stringBuilder.toString()
}

fun getFizzBuzzValue(i: Int): String {
    return when {
        // Check if the number is divisible by both 3 and 5
        i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"

        // Check if the number is divisible by 3
        i % 3 == 0 -> "Fizz"

        // Check if the number is divisible by 5
        i % 5 == 0 -> "Buzz"

        // If none of the above conditions are met, return a message indicating the number is not divisible by 3 or 5
        else -> "This number is not divisible by 3 or 5"
    }
}

fun getColoredFizzBuzzValue(i: Int): String {
    val fizzBuzzMessage = getFizzBuzzValue(i)

    return when {
        // Check if the number is divisible by both 3 and 5
        fizzBuzzMessage == "FizzBuzz" -> "$i is FizzBuzz" // No color on phone emulator

        // Check if the number is divisible by 3
        fizzBuzzMessage == "Fizz" -> "$i is Fizz"

        // Check if the number is divisible by 5
        fizzBuzzMessage == "Buzz" -> "$i is Buzz"

        // If none of the above conditions are met, return a message indicating the number is not divisible by 3 or 5
        else -> "$i is $fizzBuzzMessage"
    }
}

fun readInt(prompt: String): Int {
    print(prompt)
    return readLine()?.toIntOrNull() ?: 0
}
