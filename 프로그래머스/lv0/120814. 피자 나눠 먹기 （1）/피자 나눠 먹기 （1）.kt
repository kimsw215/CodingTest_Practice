class Solution {
    fun solution(n: Int): Int {
        var cnt: Int = 1
        while(7 * cnt / n < 1 ) cnt++
        return cnt
    }
}