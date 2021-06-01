import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {

    var fullMoonStarter: LocalDate = LocalDate.of(2021, 5, 26)//the day this info is based off of
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")//the formatter
    val today = LocalDate.now()//today's date
    val formattedToday = today.format(formatter)//today's date put through the formatter

    while(today.isAfter(fullMoonStarter))//while today is in the future of the full moon starter
        fullMoonStarter = fullMoonStarter.plusDays(29.5.toLong())//the full moon starter is equal to itself plus 29.5 days

    val formattedNextFullMoon = fullMoonStarter.format(formatter)//formatting the days till the next full moon

    println("Today's date is: $formattedToday")//print today's date
    println("The next full moon is on: $formattedNextFullMoon.")//print the date of the next full moon based on the full moon starter
}