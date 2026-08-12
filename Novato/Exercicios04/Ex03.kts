fun main() {
    
 //WHILE
   var fatiaDePizza = 0
   
    while (fatiaDePizza < 7) {
        fatiaDePizza++ 
        println("Só tem ${fatiaDePizza} fatia(s) de pizza :(")
    }
    fatiaDePizza++
    println("Há ${fatiaDePizza} fatias de pizza. Viva! Temos uma pizza inteira! :D")

 //DO WHILE
    
   var fatiasDePizza = 0
   
   fatiasDePizza++

   do {
    println("Só tem ${fatiasDePizza} fatia(s) de pizza :(")
    fatiasDePizza++
   } while (fatiasDePizza < 8)
    println("Há ${fatiasDePizza} fatias de pizza. Viva! Temos uma pizza inteira! :D")
}

main()