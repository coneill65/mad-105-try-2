class Classes constructor(var name: String, var number: String, var shift: Int){
    init {
        println("New contact added: $name")
    }

    fun printAll(){
        println()
        println("Name: $name")
        println("Number: $number")
        println("Shift: $shift")
    }

    @JvmName("setName1")
    fun setName(newName: String){
        println()
        println("Changing $name's name to: $newName")
        name = newName
    }

    @JvmName("setNumber1")
    fun setNumber(newName: String){
        name = newName
    }

    @JvmName("setShift1")
    fun setShift(newShift: String){
        name = newShift
    }
}