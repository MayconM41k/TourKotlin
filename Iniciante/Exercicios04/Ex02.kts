fun main() {
    val botao = "A"

    println (
        when (botao) {
            "A" -> "Sim"
            "B" -> "Não"
            "X" -> "Menu"
            "Y" -> "Nada"
            else -> "Não existe tal Botão"
        } 
    )
}

main()