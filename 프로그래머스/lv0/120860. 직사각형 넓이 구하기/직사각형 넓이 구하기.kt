class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var newDots = dots
        newDots.sortBy { it[0] }
        return Math.abs(newDots[1][1]-newDots[0][1]) * Math.abs(newDots[3][0] - newDots[1][0])
    }
}