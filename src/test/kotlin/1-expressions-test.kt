import org.junit.Test
import kotlin.test.assertEquals

//In Kotlin, if, when, and try are expressions; they return a value.
//
class `1-expressions-test` {

    //1.1 Basic When Statement
    // Make these tests pass using a when statement as
    // an expression to check the value of foo.
    @Test
    fun `weeble returns foobar when foo is bar`() {
        assertEquals(weeble("bar"), "foobar")
    }
    @Test
    fun `weeble returns wibble when foo is blarg`() {
        assertEquals(weeble("blarg"), "wibble")
    }
    @Test
    fun `weeble returns wobble when foo is not bar or blarg`() {
        assertEquals(weeble("glork"), "wobble")
        assertEquals(weeble("bork"), "wobble")
        assertEquals(weeble("stork"), "wobble")
    }

    //1.2 Classes and When Statements
    // Make these tests pass using a when statement as
    // an expression to check the class.
    // Bonus Points: Don't use an else.
    @Test
    fun `spamDescription returns the description of Ham`() {
        assertEquals("", spamDescription(Ham()))
    }
    @Test
    fun `spamDescription returns the description of Email`() {
        assertEquals("", spamDescription(Ham()))
    }

    //1.3
}