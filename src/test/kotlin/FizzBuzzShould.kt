import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.*

class FizzBuzzShould {
    @ParameterizedTest
    @CsvSource(*[ "1,'1'", "2, '2'"])
    fun `convert numbers using the rules`(int: Int, string: String) {
        val fizzBuzz = FizzBuzz();
        assertEquals(string, fizzBuzz.convert(int))
    }
}