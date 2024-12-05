package OOPs

open class Employee(name: String, age: Int, salary: Float) {
    init {
        println("Name is $name");
        println("Age is $age");
        println("Salary is $salary");
    }
}

class Programmer(name: String, age: Int, salary: Float) {
    fun doProgram(){
        println("Programming is my passion.");
    }
}

class Salesman(name: String, age: Int, salary: Float) {
    fun fieldwork(){
        println("Traveling is my hobby.");
    }
}

fun main(args: Array<String>) {
    val obj1 = Programmer("Chaman", 20, 40000f);
    obj1.doProgram();
    val obj2 = Salesman("Mohan", 22, 30000f);
    obj2.fieldwork();
}