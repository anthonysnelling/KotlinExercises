fun main (args: Array<String>){
    val a = 3
    val b = 4

//    print(a.plus(b))

    val point1 = Point(10, -4)
    val point2 = Point(3,8)

    var sum = point1 + point2

    println("The sum = (${sum.x}, ${sum.y})")
}

class Point(val x: Int = 0, val y: Int = 12){
    //overload plus function
    operator fun plus(p: Point): Point{
        return Point(x + p.x, y + p.y)
    }
}