fun main(args: Array<String>){
    //Default is always immutable
    var myArrayList = listOf<String>("Me", "James", "Bob", "Vida" )
    println(myArrayList)

    //make it mutable, can change it
    var mutableList = mutableListOf<String>("Me", "They" , "James")
    mutableList[0] = "Paul"

    //HashMap
    var myHashMap = hashMapOf(1 to "Paulo", 2 to "James")
    println(myHashMap.get(1))

    var myArray = arrayOf(1,4,8,10)
    myArray[0] = 3

    for (items in myArray){
        println("Items $items")
    }

//    for (items in mutableList) println("Items $items")
}