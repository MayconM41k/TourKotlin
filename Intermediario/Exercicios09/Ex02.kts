import kotlin.time.measureTime

fun main() {

    val tempoGasto = measureTime {

        val dados = List(1000) { it * 2 }

        val dadosFiltrados = dados.filter { it % 3 == 0 }

        val dadosProcessados = dadosFiltrados.map { it / 2 }

        println("Dados processados")
    }

    println("Tempo gasto: $tempoGasto")
}

main()