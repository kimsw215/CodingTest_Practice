fun main() {
    val (n, m) = readln().split(" ").map{ it.toInt() }
    val nArr = HashSet<String>()
    repeat(n) {
        nArr.add(readln())
    }
    var cnt = 0
    repeat(m) {
        if(nArr.contains(readln())) cnt++
    }
    print(cnt)
}