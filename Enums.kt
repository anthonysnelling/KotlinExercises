// Enum Classes = Allow us to represent collection of information
// (Fixed or static information)

enum class Suits{
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

fun main (args: Array<String>){

    var cardPlayer = Suits.DIAMONDS
    var cardPlayer2 = Suits.CLUBS

    if (cardPlayer == Suits.DIAMONDS) println("You are doing great")
    if (cardPlayer2 == Suits.CLUBS) println("Things aren't going great for you\n")

    var playerDirection = Directions.EAST
    if (playerDirection == Directions.EAST) println("You are heading east")


}