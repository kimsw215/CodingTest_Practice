fun main() {
    val n = readln().toInt()
    val nList = readln().split(" ").map { it.toInt() }.groupingBy { it }.eachCount()

    val m = readln().toInt()
    val mList = readln().split(" ").map { it.toInt() }

    val result = mList.map {nList.getOrDefault(it, 0) }

    println(result.joinToString(" "))
}