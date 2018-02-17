
val pair: Pair<String, String> = "foo" to "bar"

val fooo = "foo" to ("bar" to "baz")

val snork = hashMapOf(
        pair,
        "zork" to "bork",
        "spork" to setOf("fork", "spoon"),
        "cork" to listOf("foo", "foo", "foo")
)

val zork = snork["zork"]