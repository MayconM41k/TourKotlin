import kotlin.math.PI

fun areaDoCirculo(raio: Int): Double {
    return PI * raio * raio
}

fun main() {
    println(areaDoCirculo(2))
}

main()