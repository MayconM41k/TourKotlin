data class Pessoa(
    val nome: Nome,
    val endereco: Endereco,
    val possuiAnimalDeEstimacao: Boolean = true
)

data class Nome(
    val primeiro: String,
    val ultimo: String
)

data class Endereco(
    val rua: String,
    val cidade: Cidade
)

data class Cidade(
    val nome: String,
    val codigoPais: String
)

fun main() {
    val pessoa = Pessoa(
        Nome("John", "Smith"),
        Endereco("Rua Teste, 123", Cidade("Springfield", "EUA")),
        possuiAnimalDeEstimacao = false
    )

    println(pessoa)

}

main()