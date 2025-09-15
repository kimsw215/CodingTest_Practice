fun main() {
    val t = readln().toInt()
    for(i in 0 until t) {
        val (a,b) = readln().split(" ").map { it.toInt() }
        println(nCr(b,a))
    }
}

fun nCr(n: Int, r: Int): Long {
    if (r > n) return 0
    if (r == 0 || r == n) return 1

    val k = minOf(r, n - r)
    val dp = LongArray(k + 1)
    dp[0] = 1

    for (i in 1..n) {
        for (j in minOf(i, k) downTo 1) {
            dp[j] = dp[j] + dp[j - 1]
        }
    }

    return dp[k]
}