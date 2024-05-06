abstract class A1 {
   abstract fun hello()
    fun hello2(){
        println("This is hello2 function")
    }
}

class B1 : A1(){
    override fun hello(){
        println("this is hello from abstraction function")
    }
}

fun main() {
    val obj = B1()
    obj.hello()
    obj.hello2()
}