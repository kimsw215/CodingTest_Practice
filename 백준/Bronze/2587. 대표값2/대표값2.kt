import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val arr = mutableListOf<Int>()
    repeat(5) {
        arr.add(br.readLine().toInt())
    }
    arr.sort()
    bw.write("${(arr.sum()/5)}\n")
    bw.write("${arr[2]}\n")

    bw.flush()
    bw.close()
    br.close()
}