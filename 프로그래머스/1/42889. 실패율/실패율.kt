class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = mutableMapOf<Int, Double>()
        var total = stages.size
        for(i in 1 .. N) {
            val person = stages.filter { it == i }.size
            if(person == 0) {
                answer[i] = 0.0
                continue
            }
            answer[i] = person.toDouble() / total
            total -= person
        }
        return answer.toList().sortedByDescending{ it.second }.map{ it.first }.toIntArray()
    }
}