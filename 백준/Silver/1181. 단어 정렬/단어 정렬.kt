fun main() {
    val arr = mutableSetOf<String>()
    val N = readln().toInt()
    for(i in 0 until N) {
        arr.add(readln())
    }
    val ar = arr.toMutableList()
    ar.sortWith(compareBy({it.length}, {it}))
    for(i in ar) println(i)
}