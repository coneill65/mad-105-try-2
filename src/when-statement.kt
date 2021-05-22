fun main() {
    var input: Int?

    do {
        print("Enter a number to be translated to german:")
        input  = readLine()!!.toIntOrNull()
        if (input == null) println("Not a valid number, try again")
    }
    while (input == null)


    when {
        input < 97.5 -> print("Temperature is low.")
        input > 99.5 -> print("Temperature is high.")
        else -> print("Temperature is normal.")
    }
}