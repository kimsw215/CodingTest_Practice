class Solution {
    fun solution(s: String): String {
        return s.split(' ').joinToString(" ") { it.lowercase().replaceFirstChar { it.uppercase() }}
    }
}