data class Assinatura(
    val nome: String,
    val estaAtiva: Boolean
)

fun obterAssinaturaAtiva(
    assinaturas: List<Assinatura>
): Assinatura? {
    return assinaturas.singleOrNull { assinatura -> assinatura.estaAtiva }
}

fun main() {

    val usuarioComPlanoPremium = listOf(
        Assinatura("Plano Básico", false),
        Assinatura("Plano Premium", true)
    )

    val usuarioComPlanosConflitantes = listOf(
        Assinatura("Plano Básico", true),
        Assinatura("Plano Premium", true)
    )

    println(obterAssinaturaAtiva(usuarioComPlanoPremium))

    println(obterAssinaturaAtiva(usuarioComPlanosConflitantes))
}

main()