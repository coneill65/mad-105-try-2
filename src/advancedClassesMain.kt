fun main(){
    val emp1 = AdvancedClasses("Jane Doe", PositionName.ADMINISTRATION, true, 27.00, 1)
    val emp2 = AdvancedClasses("Larry Jackson", PositionName.PRODUCTION, false, 22.00, 2)
    val emp3 = AdvancedClasses("John Smith", PositionName.MAINTENANCE, false, 21.00, 3)


    emp1.display()
    emp1.calculate(45)
    emp2.display()
    emp2.calculate(50)
    emp3.display()
    emp3.calculate(35)
}