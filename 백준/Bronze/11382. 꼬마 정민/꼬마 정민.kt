import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var s = StringTokenizer(readLine())
    var sum: Long = 0
    while(s.hasMoreTokens()) {
        sum += s.nextToken().toLong()
    }
    println(sum)
}