package `control-flow`

fun main(){
    val start = 15
    val end = 25
    var sum = 0
    for(num in start..end){
        sum += num
    }
    println("Sum of numbers between $start and $end: $sum")
}