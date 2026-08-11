data class Usuario(val nome: String?)

fun obterPreferenciasNotificacao(
    usuario: Any,
    emailAtivado: Boolean,
    smsAtivado: Boolean
): List<String> {

    val usuarioValido = usuario as? Usuario ?: return emptyList()

    val nomeUsuario = usuarioValido.nome ?: "Convidado"

    return listOfNotNull(
        "Notificações por e-mail ativadas para $nomeUsuario"
            .takeIf { emailAtivado },

        "Notificações por SMS ativadas para $nomeUsuario"
            .takeIf { smsAtivado }
    )
}

fun main() {

    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario(null)
    val usuarioInvalido = "Não é um usuário"

    println(
        obterPreferenciasNotificacao(
            usuario1,
            emailAtivado = true,
            smsAtivado = false
        )
    )

    println(
        obterPreferenciasNotificacao(
            usuario2,
            emailAtivado = false,
            smsAtivado = true
        )
    )

    println(
        obterPreferenciasNotificacao(
            usuarioInvalido,
            emailAtivado = true,
            smsAtivado = true
        )
    )
}

main()