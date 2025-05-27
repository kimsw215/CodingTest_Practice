import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val Nk = readln().split(" ").map{ it.toInt() }
    val score = readln().split(" ").map { it.toInt() }.toMutableList()
    score.sort()
    bw.write("${score[score.size-Nk[1]]}")

    bw.flush()
    bw.close()
    br.close()
}