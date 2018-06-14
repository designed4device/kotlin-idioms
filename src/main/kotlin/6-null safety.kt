import net.designed4device.nullchecks.NullCheck as NullCheckJ

class NullCheck(val foo: String? = null)

fun getFooLength(nullCheck: NullCheck): Int {
    return nullCheck.foo?.length ?: 0
}

fun getNPE(nullCheck: NullCheck): Int {
    return nullCheck.foo!!.length
}

fun printNotNull(list: List<NullCheck?>) {
    list.forEach {
        it?.foo?.let { println(it) }
    }
}

// Java Interoperability
// https://kotlinlang.org/docs/reference/null-safety.html
// Any reference in Java may be null, which makes Kotlin's requirements of strict null-safety
// impractical for objects coming from Java. Types of Java declarations are treated specially
// in Kotlin and called platform types. Null-checks are relaxed for such types, so that
// safety guarantees for them are the same as in Java

val nullCheckJ = NullCheckJ().foo.length



