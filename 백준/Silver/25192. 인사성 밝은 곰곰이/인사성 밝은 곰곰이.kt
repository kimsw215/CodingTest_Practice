fun main() {
    var cnt = 0
    var chat = mutableListOf<String>()
    for(i in 0 until readln().toInt()) {
        val text = readln()
        if(text != "ENTER") {
            chat.add(text)
        } else {
            if(chat.isNotEmpty()) {
                cnt += chat.toHashSet().size
                chat.clear()
            }
        }
    }
    if(chat.isNotEmpty()) {
        cnt += chat.toHashSet().size
        chat.clear()
    }
    println(cnt)
}