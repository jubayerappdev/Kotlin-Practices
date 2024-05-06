fun main() {

    val intStack = Stack<Int>()
    intStack.push(10)
    intStack.push(20)
    intStack.push(30)
    intStack.push(40)
    println(intStack.pop())


    val strStack = Stack<String>()
    strStack.push("Jubayer")
    println(strStack.pop())
    println(strStack.pop())
    println(strStack.pop())

    val keyValuePair = KeyValuePair<Int, String>(2,"Two")
    keyValuePair.info()

    val ld = DataCallState.Loading<String>("Loading....")
   println(ld.data)
}

 sealed class DataCallState<T>(){
     //loading
     data class Loading<String>(val data:kotlin.String):DataCallState<String>()

     //success
     data class Success<T>(val data : T) : DataCallState<T>()

     //Error
     data class Error<String>(val data:kotlin.String):DataCallState<String>()



 }

class KeyValuePair<K, V>(val key: K, val value:V){
    fun info(){
        println("key is $key, value is $value")

    }

}

class Stack<T> {

    private val items = mutableListOf<T>()

    fun push(item: T) {
        items.add(item)
    }

    fun pop(): T? {

        if (items.isNotEmpty()) {
           return items.removeAt(items.size - 1)
        } else {
           return null
        }

    }

}