import java.util.*

/**
 * Customer
 * @author Colin O'Neill
 * date: 6/5/2021
 * name phone and address copy's are to allow them to be variables and cause I was having some bug.
 * printAllMain(
 * Prints the name phone and address in a neat format, this is for inherited classes
 * )
 */

open class Customer2(name: String, phone: String, address: String){
    private var nameCopy = ""
    private var phoneCopy = ""
    private var addressCopy = ""
    open var squareFootage = 0.0

    init {
        nameCopy = name
        phoneCopy = phone
        addressCopy = address
    }

    fun printAllMain(){
        println("Name: $nameCopy")
        println("Phone: $phoneCopy")
        println("address: $addressCopy")
    }
}

/**
 * Commercial
 * @author Colin O'Neill
 * date: 6/5/2021
 * property name and squareFootage are the only non inherited variables, these allow for companies square footage and properties to be tracked.
 * init(
 * adds the square footage to the total.
 * adds the property name to the array.
 * prints the weekly price.
 * )
 *
 * addProperty(
 * adds the properties name to the array, adds 1 to the number of properties, adds the square footage to the total, calculates and prints the new price.
 * )
 *
 * private function getPrice(
 * gets the price based on the total square footage and adds all discounts.
 * )
 *
 * getProperties(
 * prints all the properties in a neat menu.
 * )
 *
 * printAll(
 * uses the printAllMain function that it inherited, then prints the square footage total below that.
 * )
 */
class Commercial2 constructor(propertyName: String, name: String, phone: String, address: String, override var squareFootage: Double): Customer2(
    name,
    phone,
    address
) {
    private var numberOfProperties = 1
    private var squareFootageTotal = 0.0
    private var properties = arrayOf(propertyName)
    init {
        squareFootageTotal += squareFootage
        val price = getPrice()
        println("Your weekly price is: ${price.format(2)}")
    }

    fun addProperty(propertyName: String, squareFootage2: Double){
        properties += propertyName
        numberOfProperties += 1
        squareFootageTotal += squareFootage2
        println("Your new price is: ${getPrice().format(2)}")
    }

    private fun getPrice(): Double {
        val squareFootage2Copy = (squareFootageTotal / 1000).toInt()
        if (numberOfProperties > 1) {
            return ((squareFootage2Copy * 5.0) * 0.9)
        }
        return squareFootage2Copy * 5.0
    }

    fun getProperties(){
        var number = 0
        println("Your properties are: ")
        for (property in properties){
            number++
            println("$number. $property")
        }
    }

    fun printAll(){
        printAllMain()
        println("Square footage: $squareFootageTotal")
    }
}

/**
 * Commercial
 * @author Colin O'Neill
 * date: 6/5/2021
 * senior and squareFootage are the only non inherited variables, these allow for companies square footage and properties to be tracked.
 *
 * init(
 * adds the square footage to the total.
 * gets the price using the private getPrice function.
 * prints the weekly price.
 * )
 *
 * private function getPrice(
 * gets the price based on the total square footage and adds all discounts.
 * )
 *
 * printAll(
 * uses the printAllMain function that it inherited, then prints the square footage total below that.
 * )
 */
class Residential2 constructor(senior: Boolean, name: String, phone: String, address: String, override var squareFootage: Double): Customer2(
    name,
    phone,
    address
) {
    private var squareFootageTotal = 0.0
    private var seniorClass = senior
    init {
        squareFootageTotal += squareFootage
        val price = getPrice()
        println("Your weekly price is: ${price.format(2)}")
    }

    private fun getPrice(): Double {
        val squareFootage2Copy = (squareFootageTotal / 1000).toInt()
        if (seniorClass) {
            return ((squareFootage2Copy * 6.0) * 0.85)
        }
        return squareFootage2Copy * 6.0
    }

    fun printAll(){
        printAllMain()
        println("Square footage: $squareFootageTotal")
    }
}

fun testIfYOrN(): Boolean {
    val yOrN = true
    var seniorUserTest: String
    do {
        print("Are you a senior enter y for yes enter n for no:")
        seniorUserTest = readLine()!!.toString()
        seniorUserTest = seniorUserTest.lowercase(Locale.getDefault())
        if (seniorUserTest == "y")
            return true
        else if (seniorUserTest == "n")
            return false
    }
    while (!yOrN)

    return false
}

fun getString(): String {
    return readLine()!!.toString()
}

fun getDouble(): Double {
    var input: Double?
    do {
        print("Whats the square footage of your property:")
        input = readLine()!!.toDoubleOrNull()
    }
    while (input == null)

    return input
}

/**
 * creates 3 customers all using different variable to simulate what these classes do.
 * customer1 is a company with 2 properties giving them a 10% discount(if a company has only 1 property they dont receive a discount).
 * customer2 is a senior giving them a 15% discount.
 * customer3 is a regular citizen and receives no discounts
 */
fun main(){
    val customer1 = Commercial2("Country property", "Colin", "1234567890", "harvard", 10000.00)
    customer1.addProperty("City property", 1000.0)
    customer1.getProperties()
    customer1.printAll()

    println()

    val customer2 = Residential2(true, "Senior", "0987654321", "Chicago", 12345.00)
    customer2.printAll()

    println()

    val customer3 = Residential2(false, "NotSenior", "1234554321", "mchenry", 12345.00)
    customer3.printAll()

    println()

    println("Now create you own property" + "\n")

    val seniorUser = testIfYOrN()

    print("Enter your name:")
    val userName = getString()
    println()

    print("Enter your phone number:")
    val userPhone = getString()
    println()

    print("Enter your address:")
    val userAddress = getString()
    println()

    val squareFootage = getDouble()
    println()

    val userCustomer = Residential2(seniorUser, userName, userPhone, userAddress, squareFootage)
    userCustomer.printAll()
}