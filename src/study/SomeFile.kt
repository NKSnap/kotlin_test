package study

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext


interface Message {
    fun sendMessage(address: String)
    fun readMessage()
    fun deleteMessage()
}

open class MessageImpl(var message: String) : Message {

    override fun sendMessage(address: String) {
        if (message.isNotEmpty()) println("Отправляется сообщение по адресу $address!")
        else println("Сообщение не отправляется. Причина: сообщение не несет никакой информации!")
    }

    override fun readMessage() {
        println("Текст сообщения: $message")
    }

    override fun deleteMessage() {
        println("Сообщение удалено!")
        message = ""
    }
}

suspend fun main() {
    println("Начало работы корутины!")
    counter()

    println("Возврат на поток ${Thread.currentThread().name}")
    delay(500L)
}

suspend fun counter() = coroutineScope {
    launch {
        for (i in 1..100) {
            println("Загрузка - $i %")
            delay(1000L)
        }
    }
}
