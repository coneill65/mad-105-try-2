fun main(){
    var input: Int?
    // If your wondering why I chose this theme with a little bit of a funny store owner character the reason is cause it's fun which programming should be :)
    println("Enter the number of your choice of which shape you would like to get the area of, or enter 5 to exit.")

    do {
        println("1. Square")
        println("2. Rectangle")
        println("3. Triangle")
        println("4. Circle")
        println("5. Exit")
        print("Enter a number from 1-5 to make your choice from the menu:")
        input  = readLine()!!.toIntOrNull()
        if (input == null || input > 5 || input < 1) println("Not a valid number, try again")
    }
    while (input == null || input > 5 || input < 1)


    when (input) {
        1 -> square()
        2 -> rectangle()
        3 -> triangle()
        4 -> circle()
        5 -> print("Exiting.")
    }
}

fun square(){
    var input2: Double?
    do {
        print("Enter the length of any of the sides of the square in inches(Must be greater than 0):")
        input2  = readLine()!!.toDoubleOrNull()
        if (input2 == null || input2 < 0) println("Not a valid number, try again")
    }
    while (input2 == null || input2 < 0)
    print("The area of that square is ")
    print(getAreaOfSquare(input2))
    print(" Square inches.")
}
fun getAreaOfSquare(area: Double): Double{
    return area * area
}

fun rectangle(){
    var input3: Double?
    var input4: Double?

    do {
        print("Enter the length of the bottom side of the rectangle in inches(Must be greater than 0):")
        input3  = readLine()!!.toDoubleOrNull()
        if (input3 == null || input3 < 0) println("Not a valid number, try again")
    }
    while (input3 == null || input3 < 0)

    do {
        print("Enter the length of the right side of the rectangle in inches(Must be greater than 0):")
        input4  = readLine()!!.toDoubleOrNull()
        if (input4 == null || input4 < 0) println("Not a valid number, try again")
    }
    while (input4 == null || input4 < 0)

    print("The area of that rectangle is ")
    print(getAreaOfRectangle(input3, input4))
    print(" Square inches.")
}
fun getAreaOfRectangle(area1: Double, area2: Double): Double{
    return area1 * area2
}

fun triangle(){
    var input3: Double?
    var input4: Double?

    do {
        print("Enter the length of the bottom side of the triangle in inches(Must be greater than 0):")
        input3  = readLine()!!.toDoubleOrNull()
        if (input3 == null || input3 < 0) println("Not a valid number, try again")
    }
    while (input3 == null || input3 < 0)

    do {
        print("Enter the height of the rectangle in inches(Must be greater than 0):")
        input4  = readLine()!!.toDoubleOrNull()
        if (input4 == null || input4 < 0) println("Not a valid number, try again")
    }
    while (input4 == null || input4 < 0)

    print("The area of that rectangle is ")
    print(getAreaOfTriangle(input3, input4))
    print(" Square inches.")
}
fun getAreaOfTriangle(area1: Double, area2: Double): Double {
    return 0.5 * area1 * area2
}

fun circle(){
    var input: Double?

    do {
        print("Enter the radius of the circle in inches(Must be greater than 0):")
        input  = readLine()!!.toDoubleOrNull()
        if (input == null || input < 0) println("Not a valid number, try again")
    }
    while (input == null || input < 0)

    print("The area of that circle is ")
    print(getAreaOfCircle(input))
    print(" Square inches.")
}
fun getAreaOfCircle(area1: Double): Double {
    return 3.141592654 * area1
}