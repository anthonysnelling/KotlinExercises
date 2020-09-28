class Person {
    val name = "Tony"
    companion object Name{ // giving the name is optional
        val name = "Tony"
        fun showName() = println("My name is $name")
    }
}

fun main(args:Array<String>){
    Person.showName()
}