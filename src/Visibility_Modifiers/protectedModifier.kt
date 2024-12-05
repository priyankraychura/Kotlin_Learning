package Visibility_Modifiers

open class ProtectedClass {
    protected val int = 10;
}

class ChildClass : ProtectedClass() {
    fun getValue() : Int {
        return int;
    }
}

fun main(args: Array<String>) {
    var a = ChildClass();
    println("The value of interger is ${a.getValue()}");
}