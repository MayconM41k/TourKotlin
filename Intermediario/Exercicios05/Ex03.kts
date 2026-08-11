data class Temperatura(val celsius: Double) {

    val fahrenheit: Double = celsius * 9 / 5 + 32

    companion object {
        fun deFahrenheit(fahrenheit: Double): Temperatura =
            Temperatura((fahrenheit - 32) * 5 / 9)
    }
}

fun main() {
    val fahrenheit = 90.0

    val temperatura = Temperatura.deFahrenheit(fahrenheit)

    println("${temperatura.celsius}°C corresponde a $fahrenheit °F")
}

main()