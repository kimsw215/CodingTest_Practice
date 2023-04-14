class Solution {
    fun solution(array: IntArray): Int {
        return array.joinToString("").toList().count{it == '7'}
    }
}