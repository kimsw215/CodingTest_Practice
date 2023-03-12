class Solution {
    fun solution(array: IntArray): Int {
        var answer = array
        return answer.sorted()[answer.size/2]
    }
}