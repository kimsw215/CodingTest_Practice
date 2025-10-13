fun main() {
    val n = readln().toLong()
    var result = 1L
    if(n != 0L) {
        for(i in n downTo 1) {
            result *= i
        }
    }
    println(result)
}