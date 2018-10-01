import org.junit.Test
import kotlin.test.assertEquals
import kotlin.math.log10

class Test {
    @Test
    fun `it adds the digits of a number`() {
        assertEquals(11, 1028.addDigits(1))
    }

    @Test
    fun `numberLength = 3, sumOfDigits = 4, and k = 7 == 301`() {
        assertEquals(301, secretNumber(3,4,7))
    }

    @Test
    fun `numberLength = 5, sumOfDigits = 2, and k = 8 == 11000`() {
        assertEquals(11000, secretNumber(5,2,8))
    }

    @Test
    fun `numberLength = 4, sumOfDigits = 100, and k = 3 == -1`() {
        assertEquals(-1, secretNumber(4,100,3))
    }

    @Test
    fun spike() {

        println(Math.log(321.0))
    }
}