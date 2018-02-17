// Don't
class Zork(val gork: String, val bork: String) {
    private val snork: String
    init {
        snork = "$gork/$bork"
    }
}

// Do
class Fork(val gork: String, val bork: String) {
    private val snork: String = "$gork/$bork"
}