fun main() {

    val cat = Cat()
    cat.makeSound()
    val dog = Dog()
    dog.makeSound()

}

open class  Animal(){
    open fun makeSound(){
        println("Animal makes a sound.")
    }
}
class Cat : Animal(){
    override fun makeSound(){
        println("Cat Meows.")
    }

}
class Dog : Animal(){
    override fun makeSound() {
        println("Dog Barks.")
    }
}