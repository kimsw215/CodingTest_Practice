import java.util.*
class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val list = PriorityQueue<Int>()
        val answer = mutableListOf<Int>()
        
        for(i in score) {
           list.add(i)
            while (list.size > k) list.poll()
            answer.add(list.first())
        }
        
        return answer.toIntArray()
    }
}