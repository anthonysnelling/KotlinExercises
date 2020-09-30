// ABSTRACT CLASSES =  not meant to be instantiated
// cna have a mixture of functions declared with or without an implementation

abstract class GraphicObject {

    fun moveTo(newX: Int, newY: Int) {
        println("Moved to new x and y")
    }

    abstract fun draw()
    abstract fun resize()

}

class Circle: GraphicObject() {
    override fun draw() {
        println("Drawing Circle")
    }

    override fun resize() {
        println("Reszing circle")
    }

}

class Triangle: GraphicObject(){
    override fun draw() {
        println("Drawing Triangle")
    }

    override fun resize() {
        println("resizing Triangle")
    }

}

fun main (arg: Array<String>){
    var circle =  Circle()
    circle.draw()
    circle.moveTo(12,23)

    var triangle = Triangle()
    triangle.draw()
    triangle.resize()
}