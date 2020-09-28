fun main(args: Array<String>){
/*
    var = variable, meant to be reassigned
    val = static, compiler will not allow you to reassign
*/
    var myName = "Tony"
    myName = "Anthony"

    val pi = 3.14
    val url = "www.google.com"
//    pi = 28 compiler will not allow you to reassign

    println(myName)
    println("$pi and $url")
}