data class Funcionario(val nome: String, var salario: Int)

fun main() {
    val func = Funcionario("Maria", 20)
    println(func)
    func.salario += 10
    println(func)
}

main()