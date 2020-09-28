import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException
import sun.invoke.empty.Empty
import java.lang.NumberFormatException
import kotlin.system.exitProcess

fun main(args: Array<String>){
    /*
    * using a when statement, which is kotlin's version of a switch
    * */

    println("Enter a number between one and ten, zero to exit")
    try {
    var enteredNumber = readLine()!!.toInt()

        loop@ while (enteredNumber != 0) {
            when (enteredNumber) {
                1 -> {
                    println("Wrong number")
                    enteredNumber = readLine()!!.toInt()
                }
                2 -> {
                    println("getting closer")
                    enteredNumber = readLine()!!.toInt()
                }
                3 -> {
                    println("Closer")
                    enteredNumber = readLine()!!.toInt()
                }
                4 -> {
                    println("Hmm...")
                    enteredNumber = readLine()!!.toInt()
                }
                5 -> {
                    println("Well you are lost")
                    enteredNumber = readLine()!!.toInt()
                }
                6 -> {
                    println("bingo")
                    enteredNumber = readLine()!!.toInt()
                }
                0 -> {
                    println("Thanks for playing!")
                    break@loop
                }
                in 14..18 -> {
                    println("You in that zone bro")
                    enteredNumber = readLine()!!.toInt()
                }
                else -> {
                    println("Way cold")
                    enteredNumber = readLine()!!.toInt()
                }
            }
        }
    }
    catch (e: NumberFormatException){
        println("You Done goofed, please restart")
    }
}