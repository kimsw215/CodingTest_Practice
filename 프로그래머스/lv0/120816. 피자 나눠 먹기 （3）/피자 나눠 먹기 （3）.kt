class Solution {
    fun solution(slice: Int, n: Int): Int {
        var num = 1
        while((slice * num) / n < 1) num ++
        return num
    }
}