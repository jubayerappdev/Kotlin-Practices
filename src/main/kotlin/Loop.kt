fun main() {
//    var name = "Jubayer"
    var age = "30"
    var hasJob = true

    var num = 0
//step uses for over 2 or 3 down to for reverse
    for (i in 0..5){ // until use korle ager number porjonto cholbe downTo use korle upor theke niche jabe
//        println(i)
        println("Number is : ${num++}")
    }

    println("==========================================================")

    var numb = 10

//    while (numb<20){
//        println("Number is : $numb")
//        numb++
//    }

    do {
        println("Numb is : $numb")
    }while (numb>10)

    //Triple and pair
//    val (a,b)=Pair ("A",1)
//    println("$a $b")
//    val name = Pair("Jubayer",true)
//    val name = Pair("Jubayer", Pair("Ahmed", Pair("Asad", 1)))
//    println("${name.first}  ${name.second.second.first}")

//    val number= Triple("Hello", "world",Triple("A","B",true))
//    println("$x $y $z")
//    println("$number")


    println("Enter number for multiplication table :")
   val number= readln().toInt()

//    val numbb = 5

    for (i in 1..10) {
        val product = number * i
        println("$number * $i = $product")
    }








}
