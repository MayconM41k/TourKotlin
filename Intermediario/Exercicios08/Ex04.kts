fun validarEstoque(solicitado: Int?, disponivel: Int?): Int {

    val solicitadoValido = solicitado ?: return -1
    val disponivelValido = disponivel ?: return -1

    if (solicitadoValido < 0) return -1
    if (solicitadoValido > disponivelValido) return -1

    return solicitadoValido
}

fun main() {
    println(validarEstoque(5, 10))

    println(validarEstoque(null, 10))

    println(validarEstoque(-2, 10))
}

main()