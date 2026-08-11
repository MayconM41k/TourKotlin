fun List<Int>.incrementada(): List<Int> {
    val listaOriginal = this

    return buildList {
        for (numero in listaOriginal) {
            add(numero + 1)
        }
    }
}

fun main() {
    val listaOriginal = listOf(1, 2, 3)

    val novaLista = listaOriginal.incrementada()

    println(novaLista)
}

main()