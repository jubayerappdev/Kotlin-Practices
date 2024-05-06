fun main(){
   println("Enter Your Name..")
//   var name = "Jubayer"
   var name = readln()
   println("Enter your age..")
//   var age = 30
   var age = readln().toInt()
   println("You have job? True/False")
//   var hasJob = true
   var hasJob= readln().toBoolean()


//   println("$name, $age $hasJob")
//   if (age == 21)
//   if (age >=21)
//   if (age in 21..85)
   if(age>=21 && age<=40){
      if (hasJob==true){
         println("Congratulation $name, You can get Married! ")
      }else{
         println("First get a job, then you can get Married! ")
      }
   }else if (age<21){
      println("You are too young to get married! ")
   }else{
      println("Are You Alive?")
   }

   //when is alter of switch
   when(age){
      in 21..40-> {
         if (hasJob==true){
            println("Congratulation $name, You can get Married! ")
         }else{
            println("First get a job, then you can get Married! ")
         }
      }
      in 41..80->{
         println("You are too old to get married")
      }
      in 80..150 -> {
         println("Are You Alive?")
      }
      else->{
         println("You are not human...")
      }
   }


}