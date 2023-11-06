package `control-flow`

fun main(){
    val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
    var evenCount = 0
    var oddCount = 0

    for(number in numbers){
        if(number %2 == 0){
            evenCount++
        }else {
            oddCount++
        }
    }
    println("Number of even elements: $evenCount")
    println("Number of odd elements: $oddCount")
}