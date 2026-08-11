data class Usuario(
    val id: Int,
    var email: String
)

fun atualizarEmail(usuario: Usuario, novoEmail: String): Usuario =
    usuario.apply {
        this.email = novoEmail
    }.also {
        println("Atualizando e-mail do usuário com ID: ${it.id}")
    }

fun main() {
    val usuario = Usuario(1, "email_antigo@exemplo.com")

    val usuarioAtualizado = atualizarEmail(
        usuario,
        "email_novo@exemplo.com"
    )

    println("Usuário atualizado: $usuarioAtualizado")
}

main()