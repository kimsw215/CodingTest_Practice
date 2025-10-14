fun main() {
    println(fibonacciLoop(readln().toInt()))
}

fun fibonacciLoop(n: Int):Int {
    if(n <= 1) return n
    var a = 0 // F(0)
    var b = 1 // F(1)
    for(i in 2..n) {
        val sum = a + b // F(i) = F(i-2) + F(i-1)
        a = b // a를 F(i-1)로 업데이트
        b = sum // b를 F(i)로 업데이트
    }
    return b
}