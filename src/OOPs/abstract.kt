package OOPs

abstract class Person(_name: String){
    var name: String
    abstract var age: Int

    init {
        this.name = _name
    }

    abstract fun setPersonAge(_age: Int)
    abstract fun getPersonAge(): Int
    fun gerPersonName(){
        println("Mame = $name");
    }
}

class Employeee(_name: String) : Person(_name){
    override var age: Int = 0
    override fun setPersonAge(_age: Int) {
        age = _age;
    }
    override fun getPersonAge(): Int {
        return age;
    }

}

fun main(args: Array<String>) {
    var employee = Employeee("Chaman");
    var age : Int
    employee.setPersonAge(20);
    age = employee.getPersonAge();
//    employee.getPersonName();

    println("Age = $age");
}