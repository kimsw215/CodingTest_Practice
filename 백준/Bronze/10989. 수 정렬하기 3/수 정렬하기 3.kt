import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    val numbers = IntArray(10001)
    
    repeat(N) {
        val num = br.readLine().toInt()
        numbers[num]++
    }
    
    for(i in 0 until numbers.size) {
        repeat(numbers[i]) {
            bw.write("${i}\n")
        }
    }
    bw.flush()
    bw.close()
    br.close()
}