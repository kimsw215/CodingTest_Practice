class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        for(i in rsp){
            when(i){
                '2' -> answer += '0'
                '0' -> answer += '5'
                else -> answer += '2'
            }
        }
        return answer
    }
}