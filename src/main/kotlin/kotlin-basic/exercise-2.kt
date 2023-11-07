package `kotlin-basic`

import com.sun.source.tree.ArrayAccessTree

fun main(){
    print("Enter fahrenheit : ")
    val input = readLine();
    val celsicus = (input - 32) * 5 / 9
    println("There are Celsius : $celsicus")
}