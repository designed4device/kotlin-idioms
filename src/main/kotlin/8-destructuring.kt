data class Foobar(val foo: String, val bar: String)

val foobar = Foobar("quux", "quuux")

fun wibble() {
    val (foo, bar) = foobar
    foo.toUpperCase()
    bar.toLowerCase()
}


val map = mapOf("foo" to "bar", "boz" to "quux")

fun wobble() {

    for ((key, value) in map) {

    }

    map.forEach { (key, value) ->


    }

    map.map { (foo, bar) ->

    }
}

