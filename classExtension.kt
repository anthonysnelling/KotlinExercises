import kotlin.math.pow

fun String.removeFirstAndLastChar() : String = this.substring(1,this.length-1)
fun Int.doubleNumber(): Int {
    return this + this
}

fun Float.powerizer() {
    println(this.pow(2))
    println(this.pow(3))
    println(this.pow(4))
}

fun Int.toThePower(power:Int) : Int {
    var counter = 0
    val givenNumber = this
    var resulting = this
    while (counter < power-1){
        resulting *= givenNumber
        counter++
    }
    return resulting
}

fun main(args: Array<String>){

    val fullName = "Tony Snelling"

    val result = fullName.removeFirstAndLastChar()
    val number1 = 12
    val res = number1.doubleNumber()

    println("First characters are $result")
    println("$res")

    val number2 = 2f
    val res2 = number2.powerizer()

    println(res2)

    val number3 = 2
    val res3 = number3.toThePower(2)
    val res4 = number3.toThePower(3)
    val res5 = number3.toThePower(4)
    val res6 = number3.toThePower(5)
    val res7 = number3.toThePower(6)
    println(res3)
    println(res4)
    println(res5)
    println(res6)
    println(res7)
}