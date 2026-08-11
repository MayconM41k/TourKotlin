import kotlin.properties.Delegates.observable

class Orcamento(val orcamentoTotal: Int) {

    var orcamentoRestante: Int by observable(orcamentoTotal) {
        _, valorAntigo, valorNovo ->

        if (valorNovo < orcamentoTotal * 0.2) {
            println(
                "Atenção: seu orçamento restante ($valorNovo) " +
                "está abaixo de 20% do seu orçamento total."
            )
        } else if (valorNovo > valorAntigo) {
            println(
                "Boa notícia: seu orçamento restante aumentou para $valorNovo."
            )
        }
    }
}

fun main() {

    val meuOrcamento = Orcamento(orcamentoTotal = 1000)

    meuOrcamento.orcamentoRestante = 800

    meuOrcamento.orcamentoRestante = 150

    meuOrcamento.orcamentoRestante = 50

    meuOrcamento.orcamentoRestante = 300
}

main()