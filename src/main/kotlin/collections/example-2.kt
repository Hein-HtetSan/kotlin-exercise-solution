package collections

fun main(args: Array<String>){
    val vowels_list: List<String> = listOf("a", "e", "i", "o", "u")
    val vowels_array: Array<String> = vowels_list.toTypedArray()
    vowels_array.forEach { System.out.print(it) }
}