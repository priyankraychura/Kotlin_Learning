package Functions

fun main(args : Array<String>) {
    var sum = arrayOf(1,2,3,4,5, 6,7,8,9,10).sum();

    println("The sum of all element of array is $sum");

    var num1 = 26;
    var num2 = 3;

    var result = num1.rem(num2);
    println("The reminder when $num1 is divided by $num2 is: $result");
}