import java.util.Stack

fun main() {
    val n = readln().toInt()
    val stack = Stack<String>()
    var str = StringBuilder()

    repeat(n){
        val stk = readln().split(" ")
        when(stk[0]) {
            "push" -> {
                stack.push(stk[1])
            }
            "top" -> {
                if(stack.isEmpty()) str.append("-1\n") else str.append("${stack.peek()}\n")
            }
            "size" -> {
                str.append("${stack.size}\n")
            }
            "pop" -> {
                if(stack.isEmpty()) str.append("-1\n") else str.append("${stack.pop()}\n")
            }
            "empty" -> {
                if(stack.isEmpty()) str.append("1\n") else str.append("0\n")
            }
        }
    }
    println(str)
}