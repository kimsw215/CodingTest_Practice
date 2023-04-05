class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf(array.sorted().last(), array.indexOf(array.sorted().last()))
        return answer
    }
}