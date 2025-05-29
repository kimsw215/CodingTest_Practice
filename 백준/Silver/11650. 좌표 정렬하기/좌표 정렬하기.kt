fun main() {
    val N = readln().toInt()
    val arr = mutableListOf<Path>()
    for(i in 0 until N) {
        val xy = readln().split(" ").map{ it.toInt() }
        val x = xy[0]
        val y = xy[1]
        arr.add(Path(x,y))
    }
    arr.sortWith(compareBy({it.x}, {it.y}))
    for(i in arr) println("${i.x} ${i.y}")
}

data class Path(
val x: Int,
val y: Int
)