fun main(args : Array<String>){

    println("The sum of ${add(5,6)}")

    println("The Result is ${calculator(45.0,43.0,'-')}")

    println(convertToLetterGrade(60))

    var a = task()
    println(a)


    var lamda={a:Int, b:Int->a+b}
    println(lamda(2,3))

}
fun task():Int{
    var a=20
    var b=20
    var c=a+b
    return c

}
 private fun add(a : Int, b : Int) : Int {

    return a+b
}
fun add(a : Int, b : Int, c:Int) : Int {

    return a+b+c
}
fun calculator(num1:Double, num2:Double, operator: Char): Double{
    return when(operator){
        '+'->num1+num2
        '-'->num1-num2
        '*'->num1*num2
        '/'->num1/num2
        else->throw IllegalArgumentException("Invalid Operator")
    }

}