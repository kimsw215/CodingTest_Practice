fun main() {
    val n = readln().toInt()
    val nList = readln().split(" ").map{ it.toInt() }
    println(nList.max() * nList.min())
}