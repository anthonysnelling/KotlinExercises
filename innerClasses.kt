class Outer2{
    val mstring = "Outside nested class"

    inner class NestedClass{
        val newString = "Inside Nested Class"

        //        fun callInside():String{
//            return "Function from inside.."
//        }
        fun getStuff()= mstring

        fun callInside() = "Function call from inside Nested Class"
    }
}

fun main(args: Array<String>){
    val outer = Outer2()
    println("using Outer object: ${outer.NestedClass().getStuff()}")

    val inner = Outer2().NestedClass()
    println("User inner Object: ${inner.getStuff()}")
}