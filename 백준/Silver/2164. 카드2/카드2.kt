import java.util.LinkedList
import java.util.Queue

fun main() {
    val que: Queue<Int> = LinkedList()
    val arg = readln().toInt()

    for (i in 1..arg) que.add(i)

    while (que.size != 1) {
        que.remove()
        que.add(que.remove())
    }
    que.peek()?.let { println(it) }
}