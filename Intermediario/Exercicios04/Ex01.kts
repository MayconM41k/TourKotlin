abstract class DispositivoInteligente(val nome: String) {
    abstract fun ligar()
    abstract fun desligar()
}

class LuzInteligente(nome: String) : DispositivoInteligente(nome) {

    override fun ligar() {
        println("$nome está LIGADA.")
    }

    override fun desligar() {
        println("$nome está DESLIGADA.")
    }

    fun ajustarBrilho(nivel: Int) {
        println("Ajustando o brilho de $nome para $nivel%.")
    }
}

class TermostatoInteligente(nome: String) : DispositivoInteligente(nome) {

    override fun ligar() {
        println("O termostato $nome está aquecendo.")
    }

    override fun desligar() {
        println("O termostato $nome está desligado.")
    }

    fun ajustarTemperatura(temperatura: Int) {
        println("O termostato $nome foi ajustado para $temperatura°C.")
    }
}

fun main() {
    val luzDaSala = LuzInteligente("Luz da Sala")
    val termostatoDoQuarto = TermostatoInteligente("Termostato do Quarto")

    luzDaSala.ligar()

    luzDaSala.ajustarBrilho(10)

    luzDaSala.desligar()

    termostatoDoQuarto.ligar()

    termostatoDoQuarto.ajustarTemperatura(5)

    termostatoDoQuarto.desligar()
}

main()