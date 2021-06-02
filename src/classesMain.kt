fun main(){
    val employee1 = Classes("Colin", "1234567890", 1)
    val employee2 = Classes("Justin", "0987654321", 2)
    val employee3 = Classes("John", "5435677689", 3)
    employee1.printAll()
    employee2.printAll()
    employee3.printAll()
    employee1.setName("Not Colin")
    employee1.printAll()
}