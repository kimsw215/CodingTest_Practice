import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val Nk = readln().toMutableList()
    Nk.sort()
    Nk.reverse()
    bw.write("${Nk.joinToString("")}")
    bw.flush()
    bw.close()
    br.close()
}