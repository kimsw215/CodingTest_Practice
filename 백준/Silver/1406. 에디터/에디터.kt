import java.util.Stack

fun main() {
    var str = readln()
    val cnt = readln().toInt()
    var lStack = Stack<Char>()
    var rStack = Stack<Char>()

    str.forEach { lStack.push(it) }

    repeat(cnt){
        val strB = readln()
        when(strB[0]) {
            'L' -> {
                if(lStack.isNotEmpty()) rStack.push(lStack.pop())
            }
            'D' -> {
                if(rStack.isNotEmpty()) lStack.push(rStack.pop())
            }
            'B' -> {
                if(lStack.isNotEmpty()) lStack.pop()
            }
            else -> {
                lStack.push(strB[2])
            }
        }
    }

    while (rStack.isNotEmpty()) lStack.push(rStack.pop())
    
    println(lStack.toList().joinToString(""))
}