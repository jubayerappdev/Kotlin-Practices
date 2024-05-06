fun main() {
   val score: Int = 2147483647


//   var numbers=arrayOf<Int>(1,2,3,4,5,6,7)
//
//   for (s in numbers){
//      println(s)
//   }

//   println(numbers[8])

//   for (i in 1..10 step 2){
//      print(i)
//   }

//   repeat(100){
//      println("${it+1} Everything is fare")
//   }

//   var x = 1
//   while(x<=10){
//      print("$x ")
//      x++
//   }





   var temp = 30
   when (temp){
      in 30..35 -> print("Very Hot")
      in 36..40 ->  print("very very Hot")
      else -> print("Normal")

   }

//  val condition= if (temp>=30){
//      "HOT"
//   }else{
//      "Normal"
//   }
//   println(condition)

   val c = temp()
   println(c)

}

fun temp():Any{
   println("What's the Temperature?\n")
   val userInput = readlnOrNull()?.toInt()
   when(userInput){
      in 1..25 -> {
         return println("Weather is Hot")
      }
      in 26..35 -> {
         return println("Weather is very very Hot")
      }
      in 36..50 -> {
         return println("Weather is terrible")
      }
   }
   return ""
}