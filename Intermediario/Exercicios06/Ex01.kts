sealed class StatusEntrega {

    data class Pendente(
        val remetente: String
    ) : StatusEntrega()

    data class EmTransito(
        val dataEstimadaEntrega: String
    ) : StatusEntrega()

    data class Entregue(
        val dataEntrega: String,
        val destinatario: String
    ) : StatusEntrega()

    data class Cancelado(
        val motivo: String
    ) : StatusEntrega()
}

fun imprimirStatusEntrega(status: StatusEntrega) {
    when (status) {

        is StatusEntrega.Pendente -> {
            println("O pacote está aguardando retirada do remetente ${status.remetente}.")
        }

        is StatusEntrega.EmTransito -> {
            println("O pacote está em trânsito e deve chegar até ${status.dataEstimadaEntrega}.")
        }

        is StatusEntrega.Entregue -> {
            println("O pacote foi entregue para ${status.destinatario} em ${status.dataEntrega}.")
        }

        is StatusEntrega.Cancelado -> {
            println("A entrega foi cancelada pelo seguinte motivo: ${status.motivo}.")
        }
    }
}

fun main() {

    val status1: StatusEntrega =
        StatusEntrega.Pendente("Alice")

    val status2: StatusEntrega =
        StatusEntrega.EmTransito("2024-11-20")

    val status3: StatusEntrega =
        StatusEntrega.Entregue("2024-11-18", "Bob")

    val status4: StatusEntrega =
        StatusEntrega.Cancelado("Endereço não encontrado")

    imprimirStatusEntrega(status1)

    imprimirStatusEntrega(status2)

    imprimirStatusEntrega(status3)

    imprimirStatusEntrega(status4)
}

main()