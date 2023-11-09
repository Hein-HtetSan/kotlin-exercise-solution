package collections

fun main(args: Array<String>){
    val vowels_array: Array<String> = arrayOf("a", "e", "i", "o", "u")
    val vowels_list: List<String> = vowels_array.toList()
    vowels_list.forEach{ System.out.print(it) }
}