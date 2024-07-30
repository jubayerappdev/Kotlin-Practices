fun main() {
    val house = House() //Memory Space
    val house1 = House()
    House().apply { //apply Scope function
        updateColor("Yellow")
    }
    house1.updateColor("Black")
    println(house.color)
    println(house1.color)
    println(house) //memory location print korbe hexadecimal number

    house.isForSale = true
    println(house)
//    var house = House()
//    var house1 = House(color = "Yellow", isForSale = true, noOfWindows  = 7)
    //house2 = house
//    println(house = house2)
//    var house3 = house1.copy(isForSale = false)
//    println(house3)


}

// data class var color: String, val noOfWindows:Int = 4, var isForSale:Boolean
//fun UpdateColor(newColor:String){Colore =newColor}
class House(){
    var color:String = "White"
    val noOfWindows : Int =4
    var isForSale: Boolean = false

    fun updateColor(newColor:String):Unit{
        color = newColor

    }

    override fun toString(): String {
        return "House(color='$color', noOfWindows=$noOfWindows, isForSale=$isForSale)"
    }
    //Override parent class

}
//data class House(var color:String = "Blue", var noOfWindows:Int = 4, var isForSale:Boolean = false){
//    fun updateColor(newColor:String){
//        color = newColor
//    }
//}
