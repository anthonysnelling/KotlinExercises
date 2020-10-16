import java.awt.Choice
import java.io.FileReader
import java.io.FileWriter

fun main (args: Array<String>){
        menu()
}

fun menu(){
    var exitState = false
    while (!exitState) {
        println("\nEnter:")
        println("1 - Write")
        println("2 - Read")
        println("3 - Exit")

        var choice = readLine()!!.toInt()
        var message: String?

        when (choice) {
            1 -> {
                println("Enter message:")
                message = readLine().toString()
                writeToFile2(message)
            }
            2 -> {
                println("Reading...")
                readFromFile()
            }
            3 -> {
                println("Exiting...")
                exitState = true
            }
        }
    }
}

fun writeToFile2(message:String){
    try {
        var writer = FileWriter("appReader.txt", true)
        writer.write(message + "\n")
        writer.close()
    }catch (ex: Exception){
        println("Exception $ex")
    }
}

fun readFromFile(){
    var reader = FileReader("appReader.txt")
    var readerMessage: String? = null
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        }while (char != -1 )
    }catch (ex: Exception){
        print(ex.message)
    }
}