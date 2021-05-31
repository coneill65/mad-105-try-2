fun main(){
    val buns = arrayOf("Buns", "34")
    val hotdogs = arrayOf("Hotdogs", "22")
    val brats = arrayOf("Brats", "10")
    val ketchup = arrayOf("Ketchup", "2")
    val mustard = arrayOf("Mustard", "2")
    val relish = arrayOf("Relish", "1")
    var input: Int?
    var masterArray = arrayOf(buns, hotdogs, brats, ketchup, mustard, relish)
    var exit = false
    do {
        do {
            println()
            println("1. Get inventory")
            println("2. Change inventory")
            println("3. Exit")
            print("Please enter the number of your selection:")
            input  = readLine()!!.toIntOrNull()
            if (input == null || input > 3 || input < 1) println("Invalid choice. Select again.")
        }
        while (input == null || input > 3 || input < 1)


        when (input) {
            1 -> getInventory(masterArray)
            2 -> masterArray = changeInventory(masterArray)
            3 -> exit = true
        }
    }
    while (!exit)
    print("Exiting")
}

fun getInventory(masterArray: Array<Array<String>>){
    println()
    for (i in masterArray){
        println("${i[0]}: ${i[1]}")
    }
}

fun changeInventory(masterArray: Array<Array<String>>): Array<Array<String>>{
    var input1: Int?
    do {
        println()
        var y = 0
        for (i in masterArray){
            y++
            println("$y. ${i[0]}: ${i[1]}")
        }
        println("7. Finished")
        print("Please enter the number of the item you would like to change, enter 7 when finished:")
        input1  = readLine()!!.toIntOrNull()
        if (input1 == null || input1 > 7 || input1 < 1) println("Invalid choice. Select again.")
    }
    while (input1 == null || input1 > 7 || input1 < 1)
    input1--
    if (input1 < 6 || input1 > 1)masterArray[input1][1] = changeItem(masterArray, input1).toString()
    else if (input1 == 7) println("Returning to the main menu")
    return masterArray

}

fun changeItem(masterArray: Array<Array<String>>, entry: Int): Int {
    var input2: Int?
    var input3: Int?
    val qty = masterArray[entry][1].toInt()
    do {
        println()
        println("changing ${masterArray[entry][0]}: ${masterArray[entry][1]}")
        print("Enter 1 if you would like to add enter 2 if you would like to subtract:")
        input2  = readLine()!!.toIntOrNull()
        if (input2 == null || input2 > 2 || input2 < 1) println("Invalid choice. Select again.")
    }
    while (input2 == null || input2 > 2 || input2 < 1)

    do {
        println()
        println("changing ${masterArray[entry][0]}: ${masterArray[entry][1]}")
        print("Enter how much you would like to add or subtract:")
        input3  = readLine()!!.toIntOrNull()
        if (input3 == null) println("Invalid choice. Select again.")
    }
    while (input3 == null)

    if (input2 == 2 && qty - input3 < 0) println("That would become less than 0, The item will be set to 0")
    if (input2 == 2 && qty - input3 < 0) return 0
    if (input2 == 1) println("${masterArray[entry][0]} was: $qty now it's: ${qty + input3}")
    if (input2 == 2) println("${masterArray[entry][0]} was: $qty now it's: ${qty - input3}")

    return when (input2) {
        1 -> qty + input3
        2 -> qty - input3
        else -> qty
    }
}