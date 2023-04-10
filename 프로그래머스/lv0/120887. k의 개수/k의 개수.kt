class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        return (i..j).joinToString("").toList().count { it == k.digitToChar() }
    }
}