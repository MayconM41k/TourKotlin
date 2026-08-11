interface Veiculo {
    val nome: String
    fun mover(): String
}

object SkateVoador : Veiculo {
    override val nome = "Skate Voador"

    override fun mover() =
        "Desliza pelo ar com um motor de levitação"

    fun voar(): String = "Woooooooo"
}

fun main() {
    println("${SkateVoador.nome}: ${SkateVoador.mover()}")

    println("${SkateVoador.nome}: ${SkateVoador.voar()}")
}

main()