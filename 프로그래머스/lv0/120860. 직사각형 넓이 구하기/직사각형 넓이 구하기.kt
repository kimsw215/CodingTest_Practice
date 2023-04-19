class Solution {
    fun solution(dots: Array<IntArray>): Int {
        return Math.abs(dots[1][1]-dots[0][1]) * Math.abs(dots[2][0] - dots[1][0])
    }
}