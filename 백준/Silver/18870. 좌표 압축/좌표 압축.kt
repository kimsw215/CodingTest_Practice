import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    val arr = br.readLine().split(" ").map{ it.toInt() }
    val sortedArr = arr.distinct().sorted()
    for(i in 0 until N) {
        bw.write("${sortedArr.binarySearch(arr[i])} ")
    }
    bw.flush()
    bw.close()
    br.close()
}