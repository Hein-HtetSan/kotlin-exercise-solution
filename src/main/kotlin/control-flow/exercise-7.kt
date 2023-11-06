package `control-flow`

fun main(){
    val number = 7
    println("Multiplication table of $number:")
    for(i in 1..10){
        val result = number * i
        println("$number * $i = $result")
    }
}