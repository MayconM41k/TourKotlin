data class Usuario(
    val nomeUsuario: String,
    val estaAtivo: Boolean
)

fun obterNomesUsuariosAtivos(
    usuarios: List<Usuario>
): List<String> {
    return usuarios.mapNotNull { usuario ->
        if (usuario.estaAtivo) {
            usuario.nomeUsuario
        } else {
            null
        }
    }
}

fun main() {
    val todosUsuarios = listOf(
        Usuario("alice123", true),
        Usuario("bob_construtor", false),
        Usuario("charlie99", true)
    )

    println(obterNomesUsuariosAtivos(todosUsuarios))
}

main()