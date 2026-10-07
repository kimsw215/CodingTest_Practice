class Solution {
    fun solution(n: Int): Long {
        var answer: Long = fibonacci(n) 
        return answer
    }
    
    fun fibonacci(n: Int): Long {
        if( n <= 0 ) return 0
        if( n <= 1 ) return 1

        var pre = 1L
        var cur = 1L
        for(i in 2..n) {
            val next = (cur + pre) % 1234567
            pre = cur
            cur = next
        }
        return cur
    }
}