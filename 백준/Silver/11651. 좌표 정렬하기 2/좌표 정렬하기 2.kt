fun main() {
    val N = readln().toInt()
    val arr = mutableListOf<Pair<Int,Int>>()
    for(i in 0 until N) {
        val xy = readln().split(" ").map{ it.toInt() }
        val x = xy[0]
        val y = xy[1]
        arr.add(Pair(x,y))
    }
    arr.sortWith(compareBy({it.second}, {it.first}))
    for(i in arr) println("${i.first} ${i.second}")
}