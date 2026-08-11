fun encontrarLivrosEsgotados(estoque: List<Int>): List<Int> {
    val indicesEsgotados = mutableListOf<Int>()

    for (indice in estoque.indices) {
        if (estoque[indice] == 0) {
            indicesEsgotados.add(indice)
        }
    }

    return indicesEsgotados
}

fun main() {
    val estoque = listOf(3, 0, 7, 0, 5)

    println(encontrarLivrosEsgotados(estoque))
}

main()