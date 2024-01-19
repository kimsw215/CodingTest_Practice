import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine()!!.toInt()
    var sb = StringBuilder()
    val bw = System.out.bufferedWriter()
    
    sb.append((1..n).map { readLine()!!.toInt() }.sorted().joinToString("\n"))
    
    bw.write(sb.toString())
    bw.close()
}