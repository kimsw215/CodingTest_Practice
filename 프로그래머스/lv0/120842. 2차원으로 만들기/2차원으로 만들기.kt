class Solution {
    fun solution(numList: IntArray, n: Int): Array<IntArray> {
        var count = 0
        val answer = Array(numList.size / n) { IntArray(n) }
        for (i in 0 until (numList.size / n)) {
            for (j in 0 until n) {
                answer[i][j] = numList[count]
                count++
            }
        }
        return answer
    }
}