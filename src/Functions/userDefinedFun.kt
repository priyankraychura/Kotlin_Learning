package Functions

fun mul(num1 : Int, num2 : Int): Int{
    var number = num1.times(num2);
    return number;
}

fun main(args: Array<String>) {
    println(mul(5, 4));
}