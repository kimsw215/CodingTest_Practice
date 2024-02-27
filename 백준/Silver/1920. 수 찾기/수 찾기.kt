fun main() {
    val n = readln().toInt()
    val ns = readln().split(" ").map { it.toInt() }.toMutableSet()

    val m = readln().toInt()

    readln().split(" ").map { it.toInt() }.forEach {
        if(it in ns) println("1") else println("0")
    }
}