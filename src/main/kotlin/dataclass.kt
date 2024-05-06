fun main() {
    val user1=User3("Jubayer", 33)
    val user2= User3("Asad",22)

//    val user3= user2.copy()
//    user3.name = "gysg"

    println(user1)
    println(user2)

//    var n = Outer.Nested()
//    println(n.nestedData)

    var m = Outer()
    println(m.Nested().nestedData)

}
class Outer{
    var outerData = "This is Outer Data"

//    class Nested{
//        var nestedData = "This is nested Data"
//
//    }
inner class Nested{
    var nestedData = "This is nested Data with $outerData"


}
}


data class User3(val name: String, val age:Int)

class khgf(val name: String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as khgf

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "khgf(name='$name', age=$age)"
    }

}