fun buscarDados(callback: StringBuilder.() -> Unit) {
    val construtor = StringBuilder("Dados recebidos")
    construtor.callback()
}

fun main() {
    buscarDados {
        append(" - Processados")
        println(this.toString())
    }
}

main()