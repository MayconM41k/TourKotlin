fun main() {
    val palavras = listOf("dinossauro", "limusine", "revista", "idioma")
    for (p in palavras) {
        if (p.startsWith("l"))
            println(p)
    }
}

main()