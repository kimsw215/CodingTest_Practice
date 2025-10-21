import kotlin.math.sqrt
class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = mutableListOf<Int>()
        // 전체 = 가로 * 세로 ( 가로 & 세로 >= 3 , 가로 >= 세로)
        // 노란색 = 가로 - 2 * 세로 - 2
        // 갈색 = 전체 - 노란색
        for(i in 1..sqrt(yellow.toDouble()).toInt() ) {
            if(yellow % i == 0) {
                val a = i
                val b = yellow / i
                val totalBrown = (a + 2) * (b + 2) - yellow
                if(totalBrown == brown) {
                    answer.add(a+2)
                    answer.add(b+2)
                }
            }
        }
        return answer.sortedDescending().toIntArray()
    }
}