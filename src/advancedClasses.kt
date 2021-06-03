class AdvancedClasses constructor(var name: String, var position: PositionName, var salary: Boolean, var pay: Double, var shift: Int){

    fun display(){
        println("Name: $name")
        println("${printPosition(position)} Is salary: $salary shift: $shift")
    }

    fun calculate(hours: Int){
        val total: Double = if (shift == 1){
            pay * hours
        } else if (shift == 2 && hours > 40){
            (((pay * 40)+((pay * 1.5)*(hours - 40))) + (((pay * 40) + ((pay * 1.5) * (hours - 40))) * 5) / 100)
        } else if (shift == 2 && hours < 40) {
            (((pay * hours)) + ((pay * hours) * 5) / 100)
        } else if (shift == 3 && hours > 40){
            (((pay * 40)+((pay * 1.5)*(hours - 40))) + (((pay * 40) + ((pay * 1.5) * (hours - 40))) * 10) / 100)
        } else if (shift == 3 && hours < 40){
            (((pay * hours)) + ((pay * hours) * 10) / 100)
        } else
            0.0

        println("Rate of pay is: $$pay per hour")
        if (salary)
            println("$name earned: $${pay * 40} this week")
        else
            println("$name earned: $${total} this week")
        println()
    }

    private fun printPosition(pos: PositionName): String{
        return when (pos){
            PositionName.ADMINISTRATION -> "Administrator"
            PositionName.PRODUCTION -> "Production"
            PositionName.SALES -> "Sales"
            PositionName.MAINTENANCE -> "Maintenance"
            PositionName.TECHNICAL -> "Technical"
            PositionName.SECRETARIAL -> "Secretarial"
        }
    }
}

enum class PositionName{
    ADMINISTRATION,
    PRODUCTION,
    SALES,
    MAINTENANCE,
    TECHNICAL,
    SECRETARIAL
}