fun verificarServidorAplicacao(): Boolean {
    println("Realizando verificação de saúde do servidor de aplicação...")
    return true
}

fun verificarBancoDados(): Boolean {
    println("Realizando verificação de saúde do banco de dados...")
    return false
}

fun main() {
    val servidorAplicacaoSaudavel by lazy {
        verificarServidorAplicacao()
    }

    val bancoDadosSaudavel by lazy {
        verificarBancoDados()
    }

    when {
        servidorAplicacaoSaudavel ->
            println("O servidor de aplicação está online e saudável")

        bancoDadosSaudavel ->
            println("O banco de dados está saudável")

        else ->
            println("O sistema está offline")
    }
}

main()