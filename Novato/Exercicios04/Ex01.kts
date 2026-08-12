import kotlin.random.Random

fun main() {

    val primeiroResultado = Random.nextInt(6)
    val segundoResultado = Random.nextInt(6)

    if (primeiroResultado == segundoResultado) {
        println ("Você ganhou :)")
    } else println("Você perdeu :(")

}

main()