fun main() {
    val acoes = listOf("titulo", "ano", "autor")
    val prefixo = "https://example.com/book-info"
    val id = 5
    val urls = acoes.map { acao -> "$prefixo/$id/$acao" }
    println(urls)
}

main()