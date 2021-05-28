fun main(){
    var input: Int?

    do {
        println("1. Business Customer")
        println("2. Residential Customer")
        print("Please enter the number of your selection:")
        input  = readLine()!!.toIntOrNull()
        if (input == null || input > 2 || input < 1) println("Invalid choice. Select again.")
    }
    while (input == null || input > 2 || input < 1)


    when (input) {
        1 -> business()
        2 -> residential()
    }
}

fun business(){
    val name = enterBusinessName()
    val contactName = enterContactName()
    val number = enterNumber()
    printInfo(name, contactName, number)
}

fun residential(){
    val name = enterName()
    val number = enterNumber()
    printInfo(name, number)
}

fun enterName(): String{
    var input: String

    do {
        print("Please enter your name:")
        input  = readLine()!!.toString()
        if (input == "") println("Name cannot be empty.")
    }
    while (input == "")

    return input
}

fun enterNumber(): String{
    var input: String

    do {
        print("Please enter your phone number:")
        input  = readLine()!!.toString()
        if (input == "") println("Phone number cannot be empty.")
    }
    while (input == "")

    return input
}

fun enterBusinessName(): String{
    var input: String

    do {
        print("Please enter your business name:")
        input  = readLine()!!.toString()
        if (input == "") println("Business name cannot be empty.")
    }
    while (input == "")

    return input
}

fun enterContactName(): String{
    var input: String

    do {
        print("Please enter your contact name:")
        input  = readLine()!!.toString()
        if (input == "") println("Contact name cannot be empty.")
    }
    while (input == "")

    return input
}

fun printInfo(a: String, b: String){
    println(a)
    print(b)
}

fun printInfo(a: String, b: String, c: String){
    println(a)
    println(b)
    print(c)
}
