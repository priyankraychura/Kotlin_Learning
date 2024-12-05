interface FirstInterface {
    fun add(a : Int, b : Int = 5)
    fun print(){
        println("This is a default method defined in the interface");
    }
}

class InterfaceDemo : FirstInterface {
    override fun add(a : Int, b : Int) {
        val x = a + b;
        println("The sum is $x");
    }
    override fun print() {
        super.print();
        println("It has been overridden");
    }
}

fun main(args: Array<String>) {
    val obj = InterfaceDemo();
    println(obj.add(5));
    obj.print();
}