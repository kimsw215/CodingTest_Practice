import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val S = Stack<Int>()
    for( i in 0 until br.readLine().toInt()) {
        val N = br.readLine().split(" ").map{ it.toInt() }
        when(N.first()) {
            1 -> S.push(N[1])
            2 -> if(S.isNotEmpty()) bw.write("${S.pop()}\n") else bw.write("-1\n")
            3 -> bw.write("${S.size}\n")
            4 -> if(S.isEmpty()) bw.write("1\n") else bw.write("0\n")
            5 -> if(S.isNotEmpty()) bw.write("${S.peek()}\n") else bw.write("-1\n")
        }
    }
    
    bw.flush()
    bw.close()
    br.close()
    
}