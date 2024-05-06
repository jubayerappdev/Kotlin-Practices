fun main() {
    var age : Int?  = null
    var name : String? = null

    name = "Jubayer"
    if (name==null){
        -1
    }else{
        println(name.length)
    }

//    age= 30
//    info(age)
//    age?.let {
//        info(it)
//    }
    age = 30
    info(age?:0)
}
fun info(a:Int){
    println("Age is : $a")
}