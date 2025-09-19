fun main() {
    val chat = HashSet<String>()
    repeat(readln().toInt()) {
        val (a,b) = readln().split(" ")
        if(a == "ChongChong" || b == "ChongChong") {
            chat.add(a)
            chat.add(b)
        }
        if(chat.contains(a)) chat.add(b)
        if(chat.contains(b)) chat.add(a)
    }
    println(chat.size)
}