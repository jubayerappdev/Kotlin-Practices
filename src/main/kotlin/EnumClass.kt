fun main() {

//    val value = Color.values()
//    value.forEach { println(it.ordinal)}
    val value = Color.entries
    println(value.size)

}
enum class Color{
    Red,
    Black,
    Blue
}