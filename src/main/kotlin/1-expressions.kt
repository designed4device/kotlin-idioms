//https://kotlinlang.org/docs/reference/control-flow.html#when-expression
fun `do use the super switch`(foo: String): String {
    return when (foo) {
        "bar" -> "foobar"
        "blarg" -> "wibble"
        else -> "wobble"
    }
}


interface Spam
class Ham : Spam
class Pork : Spam
class Email : Spam

fun `the super switch is great for determining type`(spam: Spam) {
    when (spam) {
        is Ham -> TODO()
        is Pork -> TODO()
        is Email -> TODO()
    }
}

fun `the try expression is great`() {
    val barf = try {
        "great"
    } catch (e: Exception) {
        "not great"
    }.toUpperCase()
}

