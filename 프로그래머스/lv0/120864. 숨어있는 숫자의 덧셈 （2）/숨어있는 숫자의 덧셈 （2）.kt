class Solution {
    fun solution(my_string: String): Int {
        return my_string.split("[A-z]+".toRegex()).filter { it.isNotEmpty() }.sumOf { it.toInt() }
    }
}