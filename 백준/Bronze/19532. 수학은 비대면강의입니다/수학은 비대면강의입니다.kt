fun main () { 
    val arr = readln().split(" ").map { it.toDouble() }
    val group = arr.chunked(3)
    var (a, b, c) = group[0]
    var (d, e, f) = group[1]
    println("${((c*e - b*f) / (a*e - b*d)).toInt()} ${((a*f - c*d) / (a*e - b*d)).toInt()} ")
}