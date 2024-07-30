fun main() {
    var jubayer = Teacher("Jubayer",28)
    jubayer.teach()
    jubayer.eat()
    var Nur = Student("NUR", 13)



    Nur.eat("Canteen") //override run time & overload compile time by making time parameter differ


    // term DRY -> Don't repeat your code

    // inheritance gives us reusablity facilities in programming language

}
open class Human1(
    open var name: String,
    open var age: Int

){
   private var dnaReport: String =""  // class er member variable private rakhte hbe ca amra modification korte debo na-> n ccapsulation
    open fun eat(){
        println("$name can eat.")
    }
    open fun eat(location:String){
        println("$name can eat in $location")
    }

}
class  Singer(var n : String, var a :Int): Human1(n, a){

    fun sing(){
        println("$name is Singing")
    }
}

class Teacher(override var name : String,  //alada name use korle override korr proyon nai human er perameter o change korte hobe
              override var age : Int
) : Human1(name, age){

    fun teach(){
        println("$name is a teacher, he is teaching now....")
    }
    override fun eat(){
        println("$name sir, can eat..") //run time polymorphism method overriding compile time polymorphism method overloading
    }


}
class Student(
    override var name : String,
    override var age : Int ) :Human1(name, age){



    fun learn(){
        println("$name is a student, he is learning now....")
    }
//    fun eat(){
//        println("$name can eat..")
//    }


}