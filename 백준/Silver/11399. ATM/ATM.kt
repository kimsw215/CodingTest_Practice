import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine()!!.toInt()
    var s = StringTokenizer(readLine())
    val arr = mutableListOf<Int>()
    var sum = 0
    
    repeat(n) {
        arr.add(s.nextToken().toInt())
    }
    
    arr.sort()
    
    for(i in 0 until n) {
        for(j in 0..i){
            sum += arr[j]
        }
    }
    
    print(sum)
}