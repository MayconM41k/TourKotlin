fun main() {
     for (numero in 1..100) {
        println(
            when {
                numero % 15 == 0 -> "fizzbuzz"
                numero % 3 == 0 -> "fizz"
                numero % 5 == 0 -> "buzz"
                else -> "$numero"
            }
        )
    }
}

main()