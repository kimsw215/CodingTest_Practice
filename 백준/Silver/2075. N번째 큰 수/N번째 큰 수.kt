import java.util.Collections
import java.util.PriorityQueue

fun main() {
    val RerversePriorityQueue = PriorityQueue<Long>(Collections.reverseOrder())
    val cnt = readln().toInt()

    repeat(cnt) {
        readln().split(" ").forEach { RerversePriorityQueue.add(it.toLong()) }
    }

    repeat(cnt - 1) {
        RerversePriorityQueue.poll()
    }

    println(RerversePriorityQueue.peek())
}
