fun main() {
    val str = readln().split(" ").map { it.toInt() }
    var e = 1
    var s = 1
    var m = 1
    var count = 1

    while (true) {
        if(e == str[0] && s == str[1] && m == str[2]) break
        e++; s++; m++; count++
        if(e > 15) e = 1
        if(s > 28) s = 1
        if(m > 19) m = 1
    }

    println(count)
}