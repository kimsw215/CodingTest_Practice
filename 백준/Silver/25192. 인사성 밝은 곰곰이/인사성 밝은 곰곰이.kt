fun main() {
    var cnt = 0
    val chatSet = mutableSetOf<String>()
    
    repeat(readln().toInt()) {
        val text = readln()
        
        when (text) {
            "ENTER" -> {
                cnt += chatSet.size
                chatSet.clear()
            }
            else -> chatSet.add(text)
        }
    }
    cnt += chatSet.size
    
    println(cnt)
}