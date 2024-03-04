import kotlin.math.max
class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val first = intArrayOf(1,2,3,4,5)
        val second = intArrayOf(2,1,2,3,2,4,2,5)
        val third = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        val ansMut = arrayListOf<Int>(0,0,0)
        var cnt = 0
        answers.forEach {
            if(it == first[cnt % first.size]) ansMut[0]++
            if(it == second[cnt % second.size]) ansMut[1]++
            if(it == third[cnt % third.size]) ansMut[2]++
            cnt++
        }
        for(i in 0..2) {
            if(ansMut.maxOrNull() == ansMut[i]) answer = answer.plus(i + 1)
        }
        answer.sort()
        return answer
    }
}