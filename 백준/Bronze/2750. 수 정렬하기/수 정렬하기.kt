import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine()!!.toInt()
    val num = mutableListOf<Int>()
    repeat(n) {
        num.add(readLine()!!.toInt())
    }
    for(i in num.sorted()) println(i)
}