fun main() {
    val dataBox1= DataBox<String>("Hello")
    val dataBox2= DataBox<Int>(23)
    val dataBox3= DataBox<Float>(23.0f)
    dataBox1.info()
    dataBox2.info()
    dataBox3.info()

}


//class DataBoxs(var str:String){
//    fun info(){
//        println(str)
//    }
//}
class DataBox<T>(private var str: T){
    fun info(){
        println(str)
    }
}