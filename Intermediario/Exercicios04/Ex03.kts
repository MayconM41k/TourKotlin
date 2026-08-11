interface Reembolsavel {
    fun reembolsar(valor: Double)
}

abstract class MetodoPagamento(val nome: String) {

    fun autorizar(valor: Double) {
        println("Autorizando pagamento de $$valor.")
    }

    abstract fun processarPagamento(valor: Double)
}

class CartaoCredito(nome: String) : MetodoPagamento(nome), Reembolsavel {

    override fun processarPagamento(valor: Double) {
        println("Processando pagamento do cartão de crédito de $$valor.")
    }

    override fun reembolsar(valor: Double) {
        println("Reembolsando $$valor para o cartão de crédito.")
    }
}

fun main() {
    val visa = CartaoCredito("Visa")

    visa.autorizar(100.0)

    visa.processarPagamento(100.0)

    visa.reembolsar(50.0)
}

main()