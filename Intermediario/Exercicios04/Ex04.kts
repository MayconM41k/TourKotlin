interface Mensageiro {
    fun enviarMensagem(mensagem: String)
    fun receberMensagem(): String
}

class MensageiroBasico : Mensageiro {

    override fun enviarMensagem(mensagem: String) {
        println("Enviando mensagem: $mensagem")
    }

    override fun receberMensagem(): String {
        return "Você recebeu uma nova mensagem!"
    }
}

class MensageiroInteligente(
    val mensageiroBasico: MensageiroBasico
) : Mensageiro by mensageiroBasico {

    override fun enviarMensagem(mensagem: String) {
        println("Enviando uma mensagem inteligente: $mensagem")
        mensageiroBasico.enviarMensagem("[inteligente] $mensagem")
    }
}

fun main() {
    val mensageiroBasico = MensageiroBasico()
    val mensageiroInteligente = MensageiroInteligente(mensageiroBasico)

    mensageiroBasico.enviarMensagem("Olá!")

    println(mensageiroInteligente.receberMensagem())

    mensageiroInteligente.enviarMensagem("Olá do Mensageiro Inteligente!")

}

main()