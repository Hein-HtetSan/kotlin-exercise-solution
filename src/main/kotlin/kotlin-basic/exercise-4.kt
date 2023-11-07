package `kotlin-basic`

fun main(args: Array<String>){
    val a = 5
    val b = 5
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = if(b != 0) a.toDouble() / b else Double.POSITIVE_INFINITY
    println("Sum $sum," +
            "Difference: $difference," +
            "Product: $product," +
            "Quotient: $quotient")
}