fun main(args: Array<String>) {

}

object FizzBuzz {
    fun fizz(numero: Int): String {
        return if (numero % 3 == 0) {
            "fizz"
        } else {
            ""
        }

    }

    fun buzz(numero: Int): String {
        return if (numero % 5 == 0) {
            "buzz"
        } else {
            ""
        }
    }

    fun fizzBuzz(numero: Int): String {
        return if (numero % 5 == 0 && numero % 3 == 0) {
            "fizzbuzz"
        } else {
            ""
        }
    }
}
