fun main() {
    val dataBox1= DataBox<String>("Hello")
    val dataBox2= DataBox<Int>(23)
    val dataBox3= DataBox<Float>(23.0f)
    dataBox1.info()
    dataBox2.info()
    dataBox3.info()

}

class DataBox<T>(private var str: T){
    fun info(){
        println(str)
    }
}