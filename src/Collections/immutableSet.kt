package Collections

fun main(args: Array<String>) {
    var immutableSet =  setOf(45, 25, 25, 55, "Chaman", "Rohan", "Mohan", "Chaman");

    //Gives compile time error
    // immutableSet.add = "NewName";

    // Gives output with no repetition
    for(item in immutableSet){
        println(item);
    }
}