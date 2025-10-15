class Solution {
    fun solution(s: String): String {
        var n = s.split(" ").map{ it.toInt() }
        return "${n.minOf{it}} ${n.maxOf{it}}"
    }
}