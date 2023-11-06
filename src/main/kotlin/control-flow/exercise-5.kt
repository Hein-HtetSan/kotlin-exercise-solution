package `control-flow`

fun main(){
    val n = 30
    println("Fibonacci series up to $n:")
    var num1 = 0
    var num2 = 1
    print("$num1, $num2")
    while(num2 <= n){
        var nextNum = num1 + num2
        if(nextNum <= n){
            print(", $nextNum")
        }
        num1 = num2
        num2 = nextNum
    }
}