fun main() {
    val studentsMarks : MutableMap<String, Int> = mutableMapOf("Jubayer" to 90, "Nahid" to 80)

//    studentsMarks.put("Othoi", 95)
    studentsMarks["Othoi"] = 95

//Value Duplicate dewa jabe bt key duplicate dewa jabe na


//    println(studentsMarks.get("Jubayer"))
    println(studentsMarks["Othoi"])
}