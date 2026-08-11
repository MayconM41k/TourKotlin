interface Midia {
    val titulo: String
    fun reproduzir()
}

class Audio(
    override val titulo: String,
    val compositor: String
) : Midia {

    override fun reproduzir() {
        println("Reproduzindo áudio: $titulo, composto por $compositor")
    }
}

fun main() {
    val audio = Audio("Sinfonia nº 5", "Beethoven")

    audio.reproduzir()
}

main()