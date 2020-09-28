open class Animal(){

    //public visible outside of class
    //private not visible outside of class
    //PROTECTED  same as private but is also visible in subclasses or child classes
    
    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

    constructor(name: String, color:String, numLegs:Int) : this(){
        this.name = name
        this.color = color
        this.numLegs = numLegs

        println("Object: ${this.name}")
        println("Object: ${this.color}")
        println("Object: ${this.numLegs}")
    }

    constructor(name: String, color: String): this(){
        this.name = name
        this.color = color

        println("This is the third constructor" + this.name)
    }
    fun showAnimal(){
        println("Name is: ${this.name}")
        println("Color is: ${this.color}")
        println("NumLegs is: ${this.numLegs}")
    }
}

class Lion(): Animal() {

}


fun main(args:Array<String>){

//    var animal = Animal("Animal", "Brown")
    var animal = Animal()
    animal.color = "Brown"
    animal.name = "Lion"
    animal.numLegs = 4

    var animal2 = Animal("Another animal", "Blue",6)
    var animal3 = Animal("Weird ANimal", "Purple")
    var animal4 = Lion()
    animal4.color="red"
    animal4.numLegs= 2
    animal4.name="monster"

    animal.showAnimal()
    println()
    animal2.showAnimal()
    println()
    animal3.showAnimal()
    println()
    animal4.showAnimal()


//    var animal = Animal("Dog", "Brown", 4)
//    var lion = Lion()
//    lion.numLegs = 4
//    println("Numlegs: lion ${lion.numLegs}")
}