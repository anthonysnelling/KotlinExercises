fun main(args: Array<String>){
        val res= multiply(2,5)
        println("Product is: ${multiply(2,5)}")
        println("result divided is: ${divide(res,2)}")
}

fun multiply(num1: Int, num2: Int) : Int{
    var product = num1 * num2
    return product
}

fun divide(num1: Int, num2: Int) : Int{
    var result =  (num1 / num2)
    return result
}