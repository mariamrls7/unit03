import java.util.Scanner

//BMI = Weight*703/Height^2

fun main(args: Array<String>) {

    val scanner  = Scanner(System.`in`)
    val weight= scanner.nextInt()
    println("Enter your weight in lbs: $weight")
    val height= scanner.nextInt()
    println("Enter your height: $height")
    val bmi= (weight * 703f)/(height*height)

    println("Your BMI: $bmi")
if (bmi < 18.5f) {
print("You are considered underweight")
}
if (bmi > 25f){
print("You are considered overweight")
}
else {
print("Your weight is optimal")
}
}
