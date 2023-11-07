package `kotlin-basic`

fun main(args: Array<String>){

    val weight = 110
    val height = 170

    val BMI = weight / (height * height)

    val out = when{
        BMI < 18.5 -> "Underweight"
        BMI < 24.9 -> "Normal Weight"
        BMI < 29.9 -> "Overweight"
        else -> "Obese"
    }

}