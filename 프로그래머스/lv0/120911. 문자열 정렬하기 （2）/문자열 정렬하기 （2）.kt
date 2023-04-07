class Solution {
    fun solution(my_string: String): String {
        return my_string.toLowerCase().toList().sorted().joinToString("")
    }
}