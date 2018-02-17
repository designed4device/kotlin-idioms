import net.designed4device.nullchecks.NullCheck

// https://kotlinlang.org/docs/reference/null-safety.html
// Any reference in Java may be null, which makes Kotlin's requirements of strict null-safety
// impractical for objects coming from Java. Types of Java declarations are treated specially
// in Kotlin and called platform types. Null-checks are relaxed for such types, so that
// safety guarantees for them are the same as in Java

// good
val baz = NullCheck().foo?.bar?.baz?: throw Exception()

val boz = NullCheck().foo?.let {

}

// bad
val baz2 = NullCheck().foo.bar.baz

// worst
val baz3 = NullCheck().foo!!.bar!!.baz

