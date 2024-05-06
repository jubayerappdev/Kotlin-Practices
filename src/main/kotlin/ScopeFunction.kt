fun main() {

    val jubayer = User4("Jubayer", 70)
    val asad = User4("Asad", 80)

//  var jb =  jubayer.let {
//        println(it.name)
//        println(it.age)
//      it.age
//    }
//    asad.let {
//        println(it.name)
//        println(it.age)
//    }
//    var jb =  jubayer.run {
//        println(this.name)
//        println(age)
//        this
//    }
//    asad.let {
//        println(it.name)
//        println(it.age)
//    }
//    var jb =  jubayer.also {
//        println(it.name)
//        println(it.age)
//
//    }
//    var jb =  jubayer.apply {
//        println(name)
//        println(age)
//
//    }
    var jb =  with(jubayer) {
        println(name)
        println(age)

    }
//    User4("abs", 66).apply {
//        println(name)
//        println(age)
//    }
    User4("Maruf", 66).apply {
        println(name.gret())
        println(age.gun())
    }


}
//Extension function
fun Int.gun():Int{
    return this*this
}
fun String.gret(): String{
    return "Hello $this"
}

data class User4(val name:String, val age:Int)

/*
Scope function provides a way to give temporary scope to the object,
where specific operations can be applied to the object within the block of code.
Scope functions make your code more concise and readable.
*/