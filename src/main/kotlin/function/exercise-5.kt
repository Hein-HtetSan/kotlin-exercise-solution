package function

fun isPalindrome(input: String): Boolean{
    val reversed = input.reversed()
    return input == reversed
}

fun main(args: Array<String>){
    val isPal = isPalindrome("radar")
    println(isPal)
}