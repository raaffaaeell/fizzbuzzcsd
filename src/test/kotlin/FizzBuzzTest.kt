import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    companion object {
        const val divisivelPor3 = 3
        const val divisivelPor5 = 5
        const val divisivelPor3e5 = 15
    }

    @Test
    fun testFizz() {
        val resposta = FizzBuzz.fizz(divisivelPor3)
        val errada = FizzBuzz.fizz(divisivelPor5)
        Assertions.assertEquals("fizz", resposta)
        Assertions.assertEquals("", errada)
    }

    @Test
    fun testBuzz() {
        val resposta = FizzBuzz.buzz(divisivelPor5)
        val errada = FizzBuzz.buzz(divisivelPor3)
        Assertions.assertEquals("buzz", resposta)
        Assertions.assertEquals("", errada)
    }

    @Test
    fun fizzBuzz() {
        val resposta = FizzBuzz.fizz(divisivelPor3e5)
        val errada = FizzBuzz.fizzBuzz(divisivelPor3)
        Assertions.assertEquals("fizzbuzz", resposta)
        Assertions.assertEquals("", errada)
    }
}