fun intervaloEmSegundos(horas: Int = 0, minutos: Int = 0, segundos: Int = 0) =
    ((horas * 60) + minutos) * 60 + segundos

fun main() {
    println(intervaloEmSegundos(1, 20, 15))
    println(intervaloEmSegundos(minutos = 1, segundos = 25))
    println(intervaloEmSegundos(horas = 2))
    println(intervaloEmSegundos(minutos = 10))
    println(intervaloEmSegundos(horas = 1, segundos = 1))
}

main()