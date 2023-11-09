package collections.exercise

fun main(args: Array<String>){
    val numArray = doubleArrayOf(23.4, -34.5, 50.0, 33.5)
    var largest = numArray[0]

    for(num in numArray){
        if(largest < num){
            largest = num
        }
    }
    println("Largest element = %.2f".format(largest))
}