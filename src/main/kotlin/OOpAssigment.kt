//Example 1: Bank Account Class
//Scenario: Create a kotlin Class representing a bank account.
//Include properties for the account
//holder's name, accounbt number, and balance
//Implement methods to deposit and withdraw money


class BankAccount(
    val accountHolder: String,
    val accountNumber:String,
    var balance:Double
) {
    private val  minimumBalance = 500
//init block
    init {
        println("Welcole Mr. $accountHolder !")
    }

    fun deposit(amount:Double){
        balance +=amount
        println("$amount deposited. New balance : $balance")
    }
    fun withdraw(amount: Double){  //amount+500 or var legalAmount = amount + minimumBalance
        if (balance >= amount){
            balance -= amount
            println("$amount withdraw. New balance : $balance")
        }else{
            println("Insufficient balance!!!")
        }
    }
//    fun checkBalance(){
//        println("You have $balance only !")
//    }
//    fun minimumBalance(){
//        println("Your minimum balance is $minimumBalance only")
//    }
}

fun main() {
    val account = BankAccount(" Alice ", "123456789", 1000.0)
    account.deposit(500.0)
    account.withdraw(  200.0)
//    account.checkBalance()
//    account.minimumBalance()
}