class Solution {
    fun solution(cipher: String, code: Int): String {
        var str: String = "0" + cipher
        var answer = ""
        for(i in 0 until str.length){
            if(i != 0 && i % code == 0) answer += str[i]
        }
        
        
        return answer
    }
}