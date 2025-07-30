import java.util.Stack

fun main() {
    while(true) {
        val line = readln()
        if(line == ".") break
        val s = Stack<Char>()
        var result = true
        
        for(word in line) {
            when(word) {
                '(' -> s.push(word)
                '[' -> s.push(word)
                ')' -> {
                    if(s.isNotEmpty() && s.peek() == '(') s.pop()
                    else {
                        result = false
                        break
                    }
                }
                ']' -> {
                    if(s.isNotEmpty() && s.peek() == '[') s.pop()
                    else {
                        result = false
                        break
                    }
                }
            }
        }
        if(s.isEmpty() && result) println("yes") else println("no")
    }
}