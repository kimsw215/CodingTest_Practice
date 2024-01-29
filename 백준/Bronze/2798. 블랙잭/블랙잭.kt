import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var cnt_total = StringTokenizer(readLine())
    var N = cnt_total.nextToken().toInt()
    var M = cnt_total.nextToken().toInt()
    var numbers = StringTokenizer(readLine())
    val arr = mutableListOf<Int>()

    var max = 0
    repeat(N) {
        arr.add(numbers.nextToken().toInt())
    }

    for (i in 0..N - 3) {
        for (j in i + 1..N - 2) {
            for (k in j + 1 .. N - 1) {
                val sum = (arr[i] + arr[j] + arr[k])
                if( sum  <= M && sum >= max ) max = sum
            }
        }
    }
    println(max)
}