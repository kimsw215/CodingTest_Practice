import java.io.*
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cnt = readLine()!!.toInt()
    var num = StringTokenizer(readLine())
    val numbers = mutableListOf<Int>()

    val dp = Array(cnt){1}

    while(num.hasMoreTokens()){
        numbers.add(num.nextToken().toInt())
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