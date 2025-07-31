import java.util.Stack

fun main() {
     val W = Stack<Int>()
    val N = readln().toInt()
    var cur = 1
    val List = readln().split(" ").map { it.toInt() }.toMutableList().forEach {
        if(cur == it) {
            cur++
        } else {
            while(W.isNotEmpty()) {
                if(W.peek() == cur) {
                    W.pop()
                    cur++
                } else break
            }
            W.push(it)
        }
    }

    while(W.isNotEmpty()) {
        if(W.pop() == cur) cur++ else break
    }

    println(if(W.isEmpty()) "Nice" else "Sad")
}