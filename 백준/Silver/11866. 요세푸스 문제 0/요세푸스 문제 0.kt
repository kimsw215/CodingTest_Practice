import java.util.LinkedList
import java.util.Queue

fun main() {
    val Q: Queue<Int> = LinkedList()
    var now = 1
    val (n, cnt) = readln().split(" ").map { it.toInt() }
    val mut = mutableListOf<Int>()
    for(i in 1 .. n) Q.add(i)
    while(Q.isNotEmpty()) {
        if(cnt == now) {
            mut.add(Q.poll())
            now = 1
        } else {
            Q.add(Q.poll())
            now++
        }
    }
    println(mut.joinToString(", ","<",">"))
}