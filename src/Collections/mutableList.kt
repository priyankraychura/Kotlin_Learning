package Collections

fun main(args: Array<String>) {
    var mutableList = mutableListOf("Chintu", "Pruthvi", "Manan", "Tejas");

    // We can modify the element
    mutableList[0] = "Chaman";

    // Add one more element to the list
    mutableList.add("Aayush");

    for(item in mutableList) {
        println(item);
    }
}