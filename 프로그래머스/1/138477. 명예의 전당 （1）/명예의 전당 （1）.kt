class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val list = mutableListOf<Int>()
        val answer = mutableListOf<Int>()
        
        for(i in score) {
            list.add(i)
            list.sort()
            while (list.size > k) list.removeAt(0)
            answer.add(list.first())
        }
        
        return answer.toIntArray()
    }
}