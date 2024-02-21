import java.util.LinkedList
import java.util.Queue

fun main() {
    val que: Queue<Int> = LinkedList()
    val arg = readln().toInt()

    for (i in 1..arg) que.add(i)

    while (que.size != 1) {
        que.remove()
        val rest = que.remove()
        que.add(rest)
    }
    que.peek()?.let { println(it) }
}