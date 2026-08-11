sealed class Status {

    data object Carregando : Status()

    data class Erro(val problema: Problema) : Status() {

        enum class Problema {
            REDE,
            TEMPO_ESGOTADO,
            DESCONHECIDO
        }
    }

    data class Sucesso(val dados: List<String>) : Status()
}

fun lidarComStatus(status: Status) {

    when (status) {

        is Status.Carregando ->
            println("Carregando...")

        is Status.Sucesso ->
            println("Dados recebidos: ${status.dados}")

        is Status.Erro -> when (status.problema) {

            Status.Erro.Problema.REDE ->
                println("Problema de rede")

            Status.Erro.Problema.TEMPO_ESGOTADO ->
                println("A solicitação expirou")

            Status.Erro.Problema.DESCONHECIDO ->
                println("Ocorreu um erro desconhecido")
        }
    }
}

fun main() {

    val status1: Status =
        Status.Erro(Status.Erro.Problema.REDE)

    val status2: Status =
        Status.Sucesso(listOf("Dado1", "Dado2"))

    lidarComStatus(status1)

    lidarComStatus(status2)
}

main()