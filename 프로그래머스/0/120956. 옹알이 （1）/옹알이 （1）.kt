class Solution {
    fun solution(babbling: Array<String>): Int {
        val ableWord = "aya|ye|woo|ma".toRegex()
        return babbling.map { it.replace(ableWord, "") }.count{ it.isEmpty()}
    }
}