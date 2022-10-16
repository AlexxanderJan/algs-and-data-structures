import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class TestHelloWorld {
    @Test
    fun testPrintStatement() {
        val testHelloWorld = HelloWorld()
        assert(testHelloWorld.getPrintStatement() == "Hello, world!")
        testHelloWorld.getPrintStatement() shouldBe "Hello, world!"
        functionalPrintStatement() shouldBe "Hello, world!"
    }

    @Test
    fun testTrue() {
        assert(true)
    }
}
