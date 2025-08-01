import java.util.LinkedList
import java.util.Queue

fun main() {
    val Q: Queue<Int> = LinkedList()
    val sb = StringBuilder()
    repeat(readln().toInt()) {
        val n = readln().split(" ")
            when(n[0]) {
                "push" -> {
                    Q.add(n[1].toInt())
                }
                "front" -> {
                    sb.append(if(Q.isNotEmpty()) "${Q.peek()}\n" else "-1\n")
                }
                "back" -> {
                    sb.append(if(Q.isNotEmpty()) "${Q.last()}\n" else "-1\n")
                }
                "size" -> {
                    sb.append("${Q.size}\n")
                }
                "empty" -> {
                    sb.append(if(Q.isEmpty()) "1\n" else "0\n")
                }
                "pop" -> {
                    sb.append(if(Q.isNotEmpty()) "${Q.poll()}\n" else "-1\n")
                }
            }
    }

    println(sb.toString())
}