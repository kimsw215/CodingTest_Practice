import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine()!!.toInt()
    var rest = 1000 - n
    val arr = intArrayOf(500,100,50,10,5,1)
    var cnt = 0
    
    for( coin in arr ) {
        cnt += rest / coin
        rest = rest % coin
    }
    println(cnt)
}