val Double.emMilhas: Double
    get() = this * 0.621371

fun main() {
    val distanciaKm = 5.0

    println("$distanciaKm km equivalem a ${distanciaKm.emMilhas} milhas")

    val distanciaMaratona = 42.195

    println("$distanciaMaratona km equivalem a ${distanciaMaratona.emMilhas} milhas")
}

main()