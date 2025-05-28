fun main() {
    val n = readln().toMutableList()
    n.sort()
    n.reverse()
    println(n.joinToString(""))
}