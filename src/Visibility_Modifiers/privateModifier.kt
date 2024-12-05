package Visibility_Modifiers

private class A {
    private val int = 10;

    fun display() {
        println(int);
        println("Accessing int successfully!");
    }
}

fun main(args: Array<String>) {
    var a = A();
    a.display();

    // Cannot access int : it is private in class A
    // println(a.int);
}