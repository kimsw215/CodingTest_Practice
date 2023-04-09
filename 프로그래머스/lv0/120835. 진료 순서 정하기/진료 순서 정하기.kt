class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for(i in emergency)
            answer.add(emergency.sorted().reversed().indexOf(i) + 1)
        return answer.toIntArray()
    }
}