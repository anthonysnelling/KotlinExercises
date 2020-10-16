import kotlin.reflect.typeOf

class House(type: String, price: Double, yearBuilt:Int, owner: String){
    var type: String? = null
    var price: Double? = null
    var yearBuilt: Int? = null
    var owner: String? = null

    init { // initializes all the properties
        this.type = type
        this.price = price
        this.yearBuilt = yearBuilt
        this.owner = owner
    }
}

fun main(args:Array<String>){
    var myHouse = House("3 BedroomHouse", 3200.0, 1978, "Tony")
    var secondHouse = House("2 Bedroom", 50000.00, 2000, "JohnDude")
    println("${myHouse.type},  ${myHouse.price}, ${myHouse.owner}")
    println("${secondHouse.type}, ${secondHouse.price}, ${secondHouse.owner}")
}