package function

fun factorial(n: Int): Long{
    return if(n == 0 || n == 1) 1 else n * factorial(n - 1)
}

fun main(args: Array<String>){
    val result = factorial(5)
    println(result)
}