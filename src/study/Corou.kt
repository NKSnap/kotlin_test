package study

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


suspend fun main(){
    val numbers = getNumbers()
    numbers.collect { num -> println(num) }
}

fun getNumbers(): Flow<Int> = flow{
    for(item in 1..5){
        delay(500L)
        emit(item * item)
    }
}
