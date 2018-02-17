
val foo = NamedArguments(
        baz = "bobble",
        bar = "blarg",
        bongo = true
)

val bool = foo == foo.copy(bar = "foo")
val string = foo.toString()
val hash = foo.hashCode()

// https://kotlinlang.org/docs/reference/data-classes.html
// The primary constructor needs to have at least one parameter;
// All primary constructor parameters need to be marked as val or var;
// Data classes cannot be abstract, open, sealed or inner;
// (before 1.1) Data classes may only implement interfaces.

data class NamedArguments (
        val bar: String,
        val baz: String,
        val bongo: Boolean
)