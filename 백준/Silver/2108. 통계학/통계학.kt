import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.StringTokenizer
import kotlin.math.roundToInt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var numbers = readln().toInt()
    val mut = mutableListOf<Int>()
    var cnts = mutableListOf<Int>()
    
    repeat(numbers) {
        mut.add(readln().toInt())
    }
    
    val max_val = mut.groupingBy { it }.eachCount().toList().sortedByDescending { it.second }.maxOfOrNull { it.second }
    
    for(i in mut.groupingBy { it }.eachCount().filterValues { it == max_val }) {
        cnts.add(i.key)
    }
    
    val numavg = mut.average().roundToInt()
    val center = mut.sorted().get(numbers / 2)
    var maxbin = if(cnts.size > 1) cnts.sorted()[1] else cnts.sorted().first()
    val arr = mut.sorted().last() - mut.sorted().first()

    println(numavg)
    println(center)
    println(maxbin)
    println(arr)
}