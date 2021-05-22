fun main() {
    var input: Int?

    do {
        print("Enter a number from 1-10 to be translated to german:")
        input  = readLine()!!.toIntOrNull()
        if (input == null) println("Not a valid number, try again")
    }
    while (input == null || input > 10 || input < 1)


    when {
        1 == input -> print("Einz")
        2 == input -> print("Zwei")
        3 == input -> print("Drei")
        4 == input -> print("Vier")
        5 == input -> print("Fünf")
        6 == input -> print("Sechs")
        7 == input -> print("Sieben")
        8 == input -> print("Acht")
        9 == input -> print("Neun")
        10 == input -> print("Zehn")
    }
}