fun main() {
    val N = readln().toInt()
    var n = 0
    var cnt = 0
    while(true) {
        n++
        val number = n.toString()
        if("666" in number) {
            cnt++
            if(cnt == N) break
        }
    }
    println(n)
}