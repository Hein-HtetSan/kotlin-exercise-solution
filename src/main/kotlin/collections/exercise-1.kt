package collections

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>){

    val list1 = ArrayList<String>()
    list1.add("a")

    val list2 = ArrayList<String>()
    list2.add("b")

    val joined = ArrayList<String>()

    joined.addAll(list1)
    joined.addAll(list2)

    println("List1: $list1")
    println("List2: $list2")
    println("joined: $joined")

}