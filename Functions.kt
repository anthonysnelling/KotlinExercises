fun main(args: Array<String>){
    add(2,3)
    subtract(3,4)
}

fun add(num1: Int, num2: Int){
    var sum = num1 + num2
    println("Sum is: $sum")
}

fun subtract(num1: Int, num2: Int){
    var difference = num1 - num2
    println("difference is: $difference")
}