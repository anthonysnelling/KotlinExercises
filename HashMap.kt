fun main(args: Array<String>){
    // HashMap = key-Value pairs
    // (1 -> Mary)
    // (Mary -> married)

    var hashmap = HashMap<Any, String>()
    hashmap.put("Mary" , "Married")
    hashmap.put("Paulo" , "Married")
    hashmap.put("John" , "Single")

    for (k in hashmap.keys) println(hashmap.get(k))

//    println(hashmap.get("John"))

}