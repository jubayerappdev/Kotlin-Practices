fun main() {


//    var person = Person("Jubayer",38)
//
//    person.info()

    val teacher = Teacher1("Asad",33)
    teacher.info()
    teacher.callHim()

    val student = Student1("Nuru",23)
    student.info()
    student.callHim()
}

//open class Person(val name:String, val age:Int){ //Top most parent class
//
//    fun info(){
//        println("Name is : $name, age is : $age")
//    }
//
//}
interface HumanNature{
    abstract fun eat()
    abstract fun sleep()

}
abstract class Person(val name:String, val age:Int){ //Top most parent class

//    open fun callHim(){
//        println("Hey, $name")
//    }
abstract fun callHim()

    fun info(){
        println("Name is : $name, age is : $age")
    }

}
open class  Teacher1(val teacherName:String, val teacherAge :Int) : Person(teacherName,teacherAge),HumanNature{

    override fun callHim(){
        println("Hello $name Sir")
    }

    override fun eat() {

    }

    override fun sleep() {

    }

}
class  MathTeacher(val mName:String, val mAge :Int) : Teacher1(mName,mAge){ //hasARelationship

}
class  Student1(val studentName:String, val studentAge :Int) : Person(studentName,studentAge),HumanNature{
    override fun callHim(){
        println("Hello, $name. How are You?")
    }

    override fun eat() {

    }

    override fun sleep() {

    }

}