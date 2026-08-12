import kotlin.random.Random

data class Funcionario(
    val nome: String,
    var salario: Int
)

class GeradorFuncionarioAleatorio(
    var salarioMinimo: Int,
    var salarioMaximo: Int
) {
    val nomes = listOf("João", "Maria", "Ana", "Paulo", "Jack", "Elizabeth")

    fun gerarFuncionario() = Funcionario(nomes.random(), Random.nextInt(from = salarioMinimo, until = salarioMaximo))
}

fun main() {
    val geradorFuncionarios = GeradorFuncionarioAleatorio(10, 30)

    println(geradorFuncionarios.gerarFuncionario())
    println(geradorFuncionarios.gerarFuncionario())
    println(geradorFuncionarios.gerarFuncionario())

    geradorFuncionarios.salarioMinimo = 50
    geradorFuncionarios.salarioMaximo = 100

    println(geradorFuncionarios.gerarFuncionario())
}

main()