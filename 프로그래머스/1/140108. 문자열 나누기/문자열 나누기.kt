class Solution {
    fun solution(s: String): Int {
        var start = ' '
        var answer = 0
        var front = 0
        var back = 0
        
        for(i in 0 until s.length) {
            if(start == ' ') start = s[i]
            
            if(start == s[i]) front++ else back++
            
            if(front == back) {
                answer++
                front = 0
                back = 0
                start = ' '
            }
        }
        if(start != ' ') answer++
        
        return answer
    }
}