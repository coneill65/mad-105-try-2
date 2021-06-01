fun main(){
    var input: String
    var result: Int
    var totalScore = 0
    val q1 = arrayOf("The fastest bird in the world is a:", "peregrine falcon")
    val q2 = arrayOf("The fastest insect in the world is a:", "Australian tiger beetle")
    val q3 = arrayOf("The fastest fish in the world is a:", "sailfish")
    val q4 = arrayOf("The fastest mammal in the world is a:", "cheetah")
    val q5 = arrayOf("The fastest person in the world is the:", "Usain Bolt")
    val masterArray = arrayOf(q1, q2, q3, q4, q5)

    println()
    println("This is a quiz all about speed, All answers are based off of googles response to the exact question(All plurals will be changed to non plurals).")
    println()

    for (questions in masterArray){
        do {
            print(questions[0])
            input  = readLine()!!.toString()
            if (input == "") println("Entry cannot be empty.")
        }
        while (input == "")
        result = input.compareTo(questions[1], true)
        if (result == 0) {
            println("That's correct")
            totalScore += 1
        }
        else println("That's incorrect")
    }
    print("You got $totalScore right out of 5")

}