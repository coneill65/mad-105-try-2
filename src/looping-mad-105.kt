fun main() {
    var input: Int?
    // If your wondering why I chose this theme with a little bit of a funny store owner character the reason is cause it's fun which programming should be :)
    println("Hello welcome to my fruit shop. If anything on my menu interests you feel free to choose it. Best part it's all free :)")

    do {
        println("1. Apple. price: 0.00$")
        println("2. Orange. price: 0.00$")
        println("3. Banana. price: 0.00$")
        println("4. Kiwi. price: 0.00$")
        println("5. Exit")
        print("Enter a number from 1-5 to make your choice from the menu:")
        input  = readLine()!!.toIntOrNull()
        if (input == null || input > 5 || input < 1) println("Not a valid number, try again")
    }
    while (input == null || input > 5 || input < 1)


    when (input) {
        1 -> print("My finest apple for you.")
        2 -> print("Here's one orange for you, I really do love oranges.")
        3 -> print("Here's a banana, What a funny word, 3 n's 3 a's.")
        4 -> print("Here's you Gooseberry. Oh you dont know what that is? just a nickname for kiwi's.")
        5 -> print("I guess my store isn't good enough for you, no hard feelings.")
    }
}