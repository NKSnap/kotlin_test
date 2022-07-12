package study

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    val firstDog = Dog("Micky", 2, "Gray")
    firstDog.voice()

    println("The first my dog is ${firstDog.name}!\n")

    print("Enter a new dog age: ")
    val newAge = scanner.nextInt()
    firstDog.age = newAge
    println("A new age has been set!\n")

    firstDog.show()
    print("Color is ${firstDog.getColor()}")


    println()
    val arr = arrayOf(1, 2, 67, 34, 21)
    for(i in arr) print("$i ")

    println()
    val l = arrayListOf<String>()
    l.add("Vladislav")
    l.add("Nikita")
    print("Enter a new name: ")
    l.add(scanner.next())

    println(l.joinToString(", ", postfix = "!", prefix = "Names: "))
}


interface AnimalsVoice {
    fun voice()
}


open class Dog(val name: String, age_param: Int, private val color: String): AnimalsVoice {
    var age = age_param
        set(value) {
            field = if (age > 0) value else field
        }
        get() = field + 1

    init {
        println("Dog with name $name was created!")
    }

    override fun voice() {
        println(if(age < 3) "Kfi" else "Woff")
    }

    fun show() {
        println("Name: $name\nAge: $age\nColor: $color")
    }

    fun getColor() = color
}


class Cat(name: String, age_param: Int, color: String, private var character: String): Dog(name, age_param, color), AnimalsVoice{
    override fun voice() {
        println("Mya")
    }

    @JvmName("getCharacter1")
    fun getCharacter() = character

    fun showCharacter() = "$name nave $character character"
}
