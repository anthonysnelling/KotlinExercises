fun main(args: Array<String>){

    /*
    * do while loops- runs at least once
    * */

    var counter = 0

    do {
        if (counter % 3 == 0) println("fizz") else println("buzz")
        counter++
    }while (counter < 15)
}