package Visibility_Modifiers

class SomeClass {
    var int = 10;
}

public class B {
    var int = 20;

    fun display() {
        println("Accessible everywhere!");
    }
}
