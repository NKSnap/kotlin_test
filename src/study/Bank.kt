package study


fun main() {
    val bankAccount = Bank(6700)
    bankAccount.display()

    bankAccount.Transaction(200).pay()
    bankAccount.display()

    bankAccount.Transaction(340).add()
    bankAccount.display()
}

class Bank(var sum: Int) {
    interface Transactions{
        fun add()
        fun pay()
        fun clear(key: Int)
    }

    fun display(){
        println("Сумма на счете: $sum BYN")
    }

    inner class Transaction(private val opSum: Int) : Transactions {

        override fun add() {
            println("На счет поступило $opSum BYN")
            sum += opSum
        }

        override fun pay() {
            println("Со счета списано $opSum BYN")
            sum -= opSum
        }

        override fun clear(key: Int) {
            if (key == 154) {
                println("Сумма обнулена")
                sum = 0
            }
        }
    }
}
