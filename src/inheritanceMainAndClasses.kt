fun Double.format(digits: Int) = "%.${digits}f".format(this)

open class Customer(name: String, phone: String, address: String){
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

class Commercial constructor(propertyName: String, name: String, phone: String, address: String, override var squareFootage: Double): Customer(
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

class Residential constructor(senior: Boolean, name: String, phone: String, address: String, override var squareFootage: Double): Customer(
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

fun main(){
    val customer1 = Commercial("Country property", "Colin", "1234567890", "harvard", 10000.00)
    customer1.addProperty("City property", 1000.0)
    customer1.getProperties()
    customer1.printAll()

    println()

    val customer2 = Residential(true, "Senior", "0987654321", "Chicago", 12345.00)
    customer2.printAll()

    println()

    val customer3 = Residential(false, "NotSenior", "1234554321", "mchenry", 12345.00)
    customer3.printAll()
}