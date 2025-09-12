import java.util.*

fun main() {
  val Deque: Deque<Int> = LinkedList()
    var s = mutableListOf<Int>()
    val N = readln().toInt()
    val A = readln().split(" ").map { it.toInt() }
    val B = readln().split(" ").map { it.toInt() }

    for(i in 0 until N) if(A[i] == 0) Deque.add(B[i])

    val M = readln().toInt()
    val queuestack = readln().split(" ").map { it.toInt() }

    for(i in 0 until M) {
        Deque.addFirst(queuestack[i])
        s.add(Deque.removeLast())
    }
    println(s.joinToString(" "))  
}