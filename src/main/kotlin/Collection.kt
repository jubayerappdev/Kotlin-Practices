fun main() {
//    var name1 = "Nayem"
//    var name2 = "Fahim"
//    var name3 = "Jahid"

//    val names:List<String> = listOf("Nayem", "Fahim", "Jahid")
//    val names:MutableList<String> = mutableListOf("Nayem", "Fahim", "Jahid")
                                                 // 0           1        2

//    names.add("Pori Moni")
//    names.add("Muskan")
//    names.add(0,"Jubayer")
//    names.set(0,"Tuba")
//    names.add(0,"Tuba")
//    names.add(0,"Tuba")
    //Iteration
//    for (name in names){
//        println(name)
//    }
//    names.forEach{
//        println(it)
//    }
//    names.remove("Tuba")
//    println(names.get(2))
//    println(names[0])
//    println(names[1])
//    println(names[2])
                    //    Set
    val names: MutableSet<String> = mutableSetOf("Nayem", "Fahim", "Jahid")
//Duplicate value not allow
    names.add("Tuba")

//    names.add("Tuba")
//    names.add("Tuba")
//    names.add("Tuba")
//    names.add("Tuba")
//    names.add("Tuba")
    var hasName= names.contains("Jubayer")
//    if (names.contains("Jubayer")==false)
    if (hasName==false){
        println("Account not found..")
//        names.add("Jubayer")
    }else{
        println("Welcome!!")
    }


    names.forEach {
        println(it)
    }






}