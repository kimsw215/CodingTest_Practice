class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val tangerines = tangerine
        val sizeCount = tangerines.groupBy { it }.mapValues { it.value.size }
        val sortedByCount = sizeCount.values.sortedDescending()
        var cnt = 0
        var kind = 0
        for(num in sortedByCount) {
            cnt += num
            kind++
            if(cnt >= k) break
        }
        return kind
    }
}