class Solution {
    fun solution(n: Int, t: Int): Int {
        var a = n
        for(i in 1..t) a *= 2
        return a
    }
}