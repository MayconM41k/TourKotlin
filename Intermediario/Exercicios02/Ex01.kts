data class InformacoesProduto(
    val precoEmDolares: Double?
)

class Produto {
    fun obterInformacoesProduto(): InformacoesProduto? {
        return InformacoesProduto(100.0)
    }
}

fun Produto.obterPrecoEmEuros() =
    obterInformacoesProduto()?.precoEmDolares?.let {
        converterParaEuros(it)
    }

fun converterParaEuros(dolares: Double): Double {
    return dolares * 0.85
}

fun main() {
    val produto = Produto()
    val precoEmEuros = produto.obterPrecoEmEuros()

    if (precoEmEuros != null) {
        println("Preço em Euros: €$precoEmEuros")
    } else {
        println("Informações de preço não estão disponíveis.")
    }
}

main()