package Arrays

fun main() {
    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn");

    for(i in planets.indices){
        println(planets[i])
    }
}