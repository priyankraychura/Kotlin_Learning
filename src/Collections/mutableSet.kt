package Collections

fun main(args: Array<String>) {
    var mutableSet = mutableSetOf<Int>(6, 10);

    // Adding element to set
    mutableSet.add(2);
    mutableSet.add(5);

    for (item in mutableSet) {
        println(item);
    }
}