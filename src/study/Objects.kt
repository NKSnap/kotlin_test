package study


open class Objects(_name: String) {
    open val name: String = _name

    private var age: Int = 0

    private var haveWork: Boolean = false

    constructor(_name: String, _age: Int) : this(_name) {
        age = _age
    }

    constructor(_name: String, _age: Int, _gender: Boolean) : this(_name, _age) {
        haveWork = _gender
    }

    open fun displayName() {
        println(name)
    }

    open fun displayAge() {
        println(age)
    }

    fun objectsToString() {
        println("\t-------")
        println("Name of this object is $name")
        println("Age of this object is $age")
        println("Have a work? $haveWork")
        println("\t-------")
    }
}

class NewObjects(override var name: String, var age: Int) : Objects(name, age) {

    override fun displayName() {
        println("Name of the new Object: $name")
    }

    override fun displayAge() {
        println("Age of the new Object: $age")
    }

}

fun main() {
    val objects: Objects = Objects("Vladislav", 18)
    val object2: Objects = Objects("Nikita", 19, true)
    objects.objectsToString()
    object2.objectsToString()

    val o1: Objects = Objects("Vladislav", 18)
    o1.displayName()
    o1.displayAge()

    val o: NewObjects = NewObjects("Vladislav", 18)
    o.displayName()
    o.displayAge()

}
