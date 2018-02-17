
fun foo(bar: String, baz: Boolean = true) =
        if (baz) "${bar}Baz"
        else "${bar}Bongo"

val barBaz = foo("bar")
val barBongo = foo("bar", false)