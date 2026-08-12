data class Funcionario(
    val nome: String,
    var salario: Int
)

fun funcionarioPorId(id: Int) = when (id) {
    1 -> Funcionario("Maria", 20)
    2 -> null
    3 -> Funcionario("João", 21)
    4 -> Funcionario("Ana", 23)
    else -> null
}

fun salarioPorId(id: Int) = funcionarioPorId(id)?.salario ?: 0

fun main() {
    println((1..5).sumOf { id -> salarioPorId(id) })
}

main()