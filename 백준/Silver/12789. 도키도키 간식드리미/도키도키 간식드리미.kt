import java.util.Stack

fun main() {
    val S = Stack<Int>()
    val N = readln().toInt()
    var cur = 1
    val List = readln().split(" ").map{ it.toInt() }.forEach {
        if(cur == it) {
            cur++
        } else {
            while(S.isNotEmpty()) {
                if(S.peek() == cur) {
                    S.pop()
                    cur++
                } else break
            }
            S.push(it)
        }
    }
    while(S.isNotEmpty()) {
        if(S.pop() == cur) cur++ else break
    }
    println(if(S.isEmpty()) "Nice" else "Sad")
}