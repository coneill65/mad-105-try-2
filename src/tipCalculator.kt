import java.text.DecimalFormat
import java.text.Format

fun main(){
    var total = 0f
    var input: Float?

    do {
        print("Please enter the price of the item or enter 0 when finished:")
        input  = readLine()!!.toFloatOrNull()
        if (input == null) println("Invalid choice. Select again.")
        else total += input
    }
    while (input == null || input != 0.0f)

    tip(total)
}

fun tip(total: Float){
    val twoDigits = DecimalFormat("####.00")
    var tax = .025f//making these vars actually saves space cause it has to calculate the tax and tip anyway
    var tip = .175f
    var totalCopy = total// for some reason i couldn't make total a var so i had to make a copy.

    tax *= totalCopy
    tip *= totalCopy
    totalCopy += tax + tip

    print("Tax: ${twoDigits.format(tax)}$ Tip: ${twoDigits.format(tip)}$ Total: ${twoDigits.format(totalCopy)}$")
}