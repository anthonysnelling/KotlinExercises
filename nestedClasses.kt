class Outer{
    val mstring = "Outside nested class"

   class NestedClass{
        val newString = "Inside Nested Class"

//        fun callInside():String{
//            return "Function from inside.."
//        }

        fun callInside() = "Function call from inside Nested Class"
    }
}

fun main(args: Array<String>){
//    accessing the member variable of nested class
    println(Outer.NestedClass().newString)

    val nested = Outer.NestedClass()
    println(Outer.NestedClass().callInside())
}