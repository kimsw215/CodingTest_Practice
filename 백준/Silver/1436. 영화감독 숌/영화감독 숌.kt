fun main() {
    val N = readln().toInt()
    var n = 665
    var cnt = 0
    while(cnt < N) {
        n++
        var temp = n
        var consecutiveSix = 0
        while(temp > 0) {
            if(temp % 10 == 6) {
                consecutiveSix++
                if(consecutiveSix == 3) {
                    cnt++
                    break
                }
            } else {
                consecutiveSix = 0
            }
            temp /= 10
        }
    }
    println(n)
}