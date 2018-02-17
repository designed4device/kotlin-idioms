import java.util.*

fun foo() {
    for (i in 1..getInt() step 2) {  }  // closed range: includes 100
    for (i in 1 until 100) {  } // half-open range: does not include 100
    (2..10 step 2).map { }
    (10 downTo 1).filter { true }
    if (Random().nextInt() in 1..10) {  }
}

fun getInt(): Int = 10