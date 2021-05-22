fun main() {
    var temp: Double?

    print("enter the temperature outside:")

    do {
        print("Enter the original total : ")
        temp  = readLine()!!.toDoubleOrNull()
        if (temp == null) println("Not a valid number, try again")
    }
    while (temp == null)


    when {
        temp < 97.5 -> print("Temperature is low.")
        temp > 99.5 -> print("Temperature is high.")
        else -> print("Temperature is normal.")
    }
}