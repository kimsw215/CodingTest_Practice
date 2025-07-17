fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val nList = HashSet<String>()
    val result = mutableListOf<String>()
    
    repeat(n) {
        nList.add(readln())
    }

    repeat(m) {
        val word = readln()
        if(nList.contains(word)) result.add(word)
    }
    println(result.size)
    result.sorted().forEach {
        println(it)
    }
    
}