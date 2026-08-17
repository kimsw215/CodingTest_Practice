class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        var same = 0
        var zero = 0
        for(i in lottos) {
            if(win_nums.contains(i)) same++
            if(i == 0) zero++
        }
        var pride = 7 - same - zero
        // 최고 등수
        if(1 <= pride && pride <= 6) answer[0] = pride else answer[0] = 6
        // 최저 등수
        if(1 <= same && same <= 6) answer[1] = 7 - same else answer[1] = 6
        
        return answer
    }
}