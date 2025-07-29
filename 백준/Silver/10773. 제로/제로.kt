import java.util.Stack

fun main() {
    val S = Stack<Int>()
    for( i in 0 until readln().toInt()) {
        val num = readln().toInt()
        if(num == 0) {
            S.pop()
        } else {
            S.push(num)
        }
    }
    println(S.sum())
}