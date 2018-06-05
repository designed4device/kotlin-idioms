//https://kotlinlang.org/docs/reference/control-flow.html#when-expression

/**
 * 1.1 Basic When Statement
 */
fun weeble(foo: String): String {
    return when (foo) {
        "bar" -> "foobar"
        "blarg" -> "wibble"
        else -> "wobble"
    }
}


interface Spam
class Ham : Spam
class Email : Spam

/**
 * 1.2 Classes and When Statements
 */
fun spamDescription(spam: Spam): String {
    return when (spam) {
        is Ham -> "it's edible..."
        is Email -> "it's annoying"
        else -> "it's definitely not spam"
    }
}

/**
 * function that performs integer division
 * @return null if division throws exception, else result of division
 */
fun divide(dividend: Int, divisor:Int): Int? {
    return try {
        dividend / divisor
    } catch (e: Exception) {
        null
    }
}

/**
 * Creates Spam based on string input
 * @return an instance of Spam
 */
fun makeSpam(type: String): Spam {
    return if (type == "email") Email() else Ham()
}

