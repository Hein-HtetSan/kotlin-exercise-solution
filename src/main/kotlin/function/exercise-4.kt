package function

fun findMax(a: Int, b: Int, c: Int): Int{
    return maxOf(a, b, c)
}

fun main(args: Array<String>){
    val maxNumber = findMax(8, 12, 6)
    println(maxNumber)
}