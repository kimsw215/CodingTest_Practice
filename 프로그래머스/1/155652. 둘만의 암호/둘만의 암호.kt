class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        var skipInt = skip.map { it.toInt() }
        for(curChar in s) {
            var now = curChar.toInt()
            var cnt = 0
            
            while(true) {
                now++
                if(now > 'z'.toInt()) now = 'a'.toInt()
                if(now !in skipInt) {
                    cnt++
                }
                if(cnt == index) break
            }
            answer += now.toChar().toString()
        }
        
        return answer
    }
}