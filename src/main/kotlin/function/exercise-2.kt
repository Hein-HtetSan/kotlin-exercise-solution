package function

fun reverseString(input: String): String {
    return input.reversed()
}

fun main(args: Array<String>){
    val reversed = reverseString("Kotlin")
    println(reversed)
}