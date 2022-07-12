package study


fun main() {

    val age = 87
    val name = "Vladislav"
    val gender = 'm'
    val height = 177.6
    var someObject: Any
    someObject = 7888

    println("\nHello, $name. Your age is not correct: $age\nGender - $gender\nHeight is $height\nSome value - $someObject")

    someObject = "Other value"
    println("New some value - $someObject")

    print("Enter your name: ")
    val userName = readLine()
    println("Your name is $userName?")

    val answer = readLine()
    if (answer == "yes")
        println("Welcome, $userName")
    else
        println("Soo.. then you aren't $userName")

    print("Enter your age: ")
    when(readLine()) {
        "18" -> println("You are ready")
        else -> println("You don't fit ")
    }
}