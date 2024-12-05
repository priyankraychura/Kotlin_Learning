package Collections

fun main(args: Array<String>) {
    val immutableList = listOf("Pruthvi", "Chaman", "Rohan");

    // Gives compile time error
    // immutableList.add = "Champu";

    for(item in immutableList){
        println(item)
    }
}