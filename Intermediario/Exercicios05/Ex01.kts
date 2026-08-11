interface Pedido {
    val idPedido: String
    val nomeCliente: String
    val totalPedido: Double
}

data object PedidoUm : Pedido {
    override val idPedido = "001"
    override val nomeCliente = "Alice"
    override val totalPedido = 15.50
}

data object PedidoDois : Pedido {
    override val idPedido = "002"
    override val nomeCliente = "Bob"
    override val totalPedido = 12.75
}

fun main() {

    println("Nome do pedido: $PedidoUm")

    println("Nome do pedido: $PedidoDois")

    println("Os dois pedidos são idênticos? ${PedidoUm == PedidoDois}")

    if (PedidoUm == PedidoDois) {
        println("Os pedidos são idênticos.")
    } else {
        println("Os pedidos são diferentes.")
    }

    println(
        "Os pedidos possuem o mesmo nome de cliente? " +
        "${PedidoUm.nomeCliente == PedidoDois.nomeCliente}"
    )
}

main()