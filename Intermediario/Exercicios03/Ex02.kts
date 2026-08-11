class Botao {
    fun aoEvento(acao: EventoBotao.() -> Unit) {
        val evento = EventoBotao(
            cliqueDireito = false,
            quantidade = 2,
            posicao = Posicao(100, 200)
        )

        evento.acao()
    }
}

data class EventoBotao(
    val cliqueDireito: Boolean,
    val quantidade: Int,
    val posicao: Posicao
)

data class Posicao(
    val x: Int,
    val y: Int
)

fun main() {
    val botao = Botao()

    botao.aoEvento {
        if (!cliqueDireito && quantidade == 2) {
            println("Clique duplo!")
        }
    }
}

main()