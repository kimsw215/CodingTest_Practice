import java.io.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cnt = readLine()!!.toInt()
    var num = readLine()!!.toString()
    val numbers = mutableListOf<Int>()

    val dp = Array(cnt){1}

    for (i in num.split(" ")) {
        numbers.add(i.toInt())
    }

    for (i in 0 until cnt) {
        for (j in 0 until i) {
            if(numbers[i] > numbers[j]) {
                dp[i] = max(dp[i], dp[j]+1)
            }
        }
    }
    
    println(dp.maxOrNull())
}