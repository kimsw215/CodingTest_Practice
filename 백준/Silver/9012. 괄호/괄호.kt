import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    repeat(n) {
        val ps = readLine()
        val stack: Stack<Char> = Stack()

        try {
            ps.forEach {
                if (it == '(') stack.push('(')
                else stack.pop()
            }
            if (stack.isEmpty()) println("YES")
            else println("NO")
        }
        catch (e: Exception) { println("NO") }
    }
}
