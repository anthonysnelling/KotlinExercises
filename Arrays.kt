fun main(args: Array<String>){
    var myArray = Array<Int>(6){2}
    myArray[0] = 10
    myArray[1] = 2
    myArray[2] = 12
    myArray[3] = 5678
    myArray[4] = 34
    myArray[5] = 323456


    //printing with objects
    var tracker = 0
    for (element in myArray){
        println("Index is $tracker Items: $element")
        tracker++
    }

    println()

    //printing items inside of the array via index
    for (index in 0..myArray.size-1){
        println(myArray[index])
    }

    println(myArray[0])

}