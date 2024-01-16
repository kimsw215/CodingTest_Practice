import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stack: Stack<Int> = Stack()
    var cnt = readLine()!!.toInt()
    var cur = 1
    val numbers = mutableListOf<Int>()
    val result = mutableListOf<Char>()
    
    repeat(cnt) {
        val n = readLine()!!.toInt()
        numbers.add(n)
    }
    
    for (num in numbers) {
        while (cur <= num) {
            stack.push(cur++)
            result.add('+')
        }
        if (stack.peek() == num) {
            stack.pop()
            result.add('-')
        } else {
            println("NO")
            return
        }
    }
    result.forEach { println(it) }
}