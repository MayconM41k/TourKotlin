fun repetirN(n: Int, acao: () -> Unit) {
    for (i in 1..n) {
        acao()
    }
}

fun main() {
    repetirN(5) {
        println("Olá")
    }
}

main()