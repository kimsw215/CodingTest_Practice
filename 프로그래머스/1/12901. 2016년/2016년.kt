class Solution {
    fun solution(a: Int, b: Int): String {
        var sum = b - 1
        val lastDay = mutableListOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val dayList = mutableListOf("FRI","SAT","SUN","MON","TUE","WED","THU")
        for(i in 0 until a - 1) sum += lastDay[i]
        return dayList[sum % 7]
    }
}