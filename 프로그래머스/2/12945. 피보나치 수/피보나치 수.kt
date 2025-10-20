class Solution {
    fun solution(n: Int): Int {
        var answer = fibonacci(n)
        return answer
    }
    
    fun fibonacci(n: Int): Int {
        if(n <= 1) return n
        var a = 0
        var b = 1
        for(i in 2..n) {
            val sum = (a + b) % 1234567
            a = b
            b = sum
        }
        return b
    }
}