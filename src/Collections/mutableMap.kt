package Collections

fun main(args: Array<String>) {
    var mutableMap = mutableMapOf<Int, String>(1 to "Pravan", 2 to "Chaman", 3 to "Raman");

    // We can modify the element
    mutableMap.put(1, "Pruthvi");

    // Add one more element in the list
    mutableMap.put(4, "newName");

    for (item in mutableMap.values) {

        println(item)
    }
}