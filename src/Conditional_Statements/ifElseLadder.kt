package Conditional_Statements

fun main() {
    val num = 10;

    val result = if(num > 0){
        "$num is positive"
    } else if(num < 0){
        "$num is negative"
    } else{
        "$num is zero"
    }

    println(result)
}