class Solution {
    fun solution(my_str: String, n: Int): List<String> {
        return my_str.chunked(n)
    }
}