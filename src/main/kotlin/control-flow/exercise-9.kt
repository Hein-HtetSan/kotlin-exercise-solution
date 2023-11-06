package `control-flow`

fun main(){
    var number1 = 28
    var number2 = 16

    while(number2 != 0){
        val temp = number2
        number2 = number1 % number2
        number1 = temp
    }

    println("GCD of two number is: $number1")
}