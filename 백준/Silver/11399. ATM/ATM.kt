import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine()!!.toInt()
    val s = readLine()
    val arr = mutableListOf<Int>()
    var sum = 0
    for(i in s.split(" ")) arr.add(i.toInt())
    arr.sort()
    for(i in 0 until n) {
        for(j in 0..i){
            sum += arr[j]
        }
    }
    
    println(sum)
}