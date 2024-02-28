fun main() {
    val kn = readln().split(" ").toList()
    val ns = mutableListOf<Long>()
    repeat(kn[0].toInt()) { ns.add(readln().toLong()) }

    val result = kn[1].toInt()

    var start = 1L
    var end = ns.sorted().last()

    while (start <= end) {
        var cnt = 0L
        val mid = (start + end) / 2
        ns.forEach { cnt += it / mid }

        if (cnt < result) end = mid - 1 else start = mid + 1
    }
    println(end)
}