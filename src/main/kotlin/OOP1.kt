fun main() {
    var juabyer = Human()
    juabyer.name = "Jubayer Ahmed"
    juabyer.teaching()
    juabyer.singing()
//    teaching() // No data security

    var asad = User(name = "Jubayer", age = 33)
//    asad.name = "Jubayer Ahmed"
//    asad.age = 28
    asad.eat()

}
//fun teaching (){
//    println("$name is Teaching now...")
//}
class Human{
    var name = "Jubayer"
    var age = 50
    var hasGF = false

    fun teaching (){
        println("$name is Teaching now...")
    }
    fun singing(){
        println("$name is singing in bathroom...")
    }

}

class User (
    private var name : String,
    private var age: Int
    ) {

    constructor(a: String, b: Int, c:Int):this(a,b){


    }
//    var name = ""
//    var age = 0

    fun eat(){
        println("$name, at the age of $age he eat rice everyday !")

    }
}