import kotlin.math.*

fun calcularJurosCompostos(
    principal: Double,
    taxa: Double,
    vezesCapitalizado: Int,
    anos: Int
): Double {
    return principal * (1 + taxa / vezesCapitalizado)
        .pow(vezesCapitalizado * anos)
}

fun main() {

    val principal = 1000.0
    val taxa = 0.05
    val vezesCapitalizado = 4
    val anos = 5

    val montante = calcularJurosCompostos(
        principal,
        taxa,
        vezesCapitalizado,
        anos
    )

    println("O montante acumulado é: $montante")
}

main()