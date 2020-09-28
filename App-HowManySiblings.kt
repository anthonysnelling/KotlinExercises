fun main(args: Array<String>){
    /*
    * The user is prompted with a question
    * the user has to enter an answer
    * if the answer is incorrect the user is prompted with the answer
    * else the application terminates
    *
    * */

    var isTrue: Boolean? = false

    do {
        println("How many siblings does Paulo have?")
        var answer: Int? = readLine()!!.toInt()

        when(answer) {
            12 -> {
                isTrue = true
                println("you are correct!!")
            }
            else -> println("Incorrect! Try again! \n")
        }
    }while (isTrue == false)

}