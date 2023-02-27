import java.util.Scanner

//Newtons= Mass*9.8

fun main(args: Array<String>) {

    val scanner  = Scanner(System.`in`)
    val mass= scanner.nextInt()
    println("Enter an objects mass: $mass")

    val weight= mass * 9.8f 

    println("The objects weight is: $weight")
if (weight < 10f){
print("The object is too light")
} 
if (weight > 1000f){
print("The object is too heavy")
}
}
