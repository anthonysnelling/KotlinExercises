// Interface classes that have methods without bodies
interface InputHandler {
    fun clicked()
    fun doubleClick()
    fun singleClick()
}

class Button: InputHandler{
    override fun clicked() {
        println("Button Clicked")
    }

    override fun doubleClick() {
        println("Double Clicked")
    }

    override fun singleClick() {
        println("Single Clicked")
    }

}
class phone:InputHandler{
    override fun clicked() {
        println("Phone clicked")
    }

    override fun doubleClick() {
        println("Phone double clicked")
    }

    override fun singleClick() {
        println("Phone double clicked")
    }

}
fun main (args: Array<String>){
    var myButton = Button()
    myButton.clicked()

    var phone = phone()
    phone.clicked()

}