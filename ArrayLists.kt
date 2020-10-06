fun main(args: Array<String>){
    //ArrayLists
    var myArrayList = ArrayList<String>()
    myArrayList.add("James")
    myArrayList.add("Tom")
    myArrayList.add("Alan")
    myArrayList.add("Abby")
    //Sets that index to the given parameter
    myArrayList.set(1,"Salmon")

    if (myArrayList.contains("Abby")) println("Hello Abby!")
    //removes James from the list
    myArrayList.remove("James")
    //iterating through objects
    for (names in myArrayList){
        println("Names: $names")
    }

    for (index in 0 until myArrayList.size)
    println("items: " + myArrayList[index])
}