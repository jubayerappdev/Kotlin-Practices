fun main() {

//    val user = User2("Jubayer",20) //java kotlin inter change able
//    val user1= User2("Asad",22,5.8)

    val book1 = Book("Book A", "Author X")
    val book2 = Book("Book B", "Author X",2023)



}

class Book(val title: String, val author:String){

   constructor(
       title: String,
       author: String,
       publicationYear:Int
   ): this(title, author){
       println("Secondary constructor called for $title ")
       println(" Published in $publicationYear")
   }
}