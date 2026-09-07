class Solution {
    fun solution(new_id: String): String {
        val regex = "[^a-z0-9\\-_.]".toRegex()
        val dot = ".."
        var answer: String = new_id.lowercase().replace(regex, "")
        while (true) {
            if (dot in answer) answer = answer.replace(dot, ".")
            else break
        }
        
        if (answer.isNotEmpty() && answer.first() == '.') answer = answer.substring(1 .. answer.lastIndex)
        if (answer.isNotEmpty() && answer.last() == '.') answer = answer.substring(0 until answer.lastIndex)
    
        if (answer.isEmpty()) answer = "a"

        if (answer.length > 15) {
            answer = answer.substring(0 until 15)
            if (answer.last() == '.') answer = answer.substring(0, answer.lastIndex)
        } else if (answer.length < 3) {
            while (answer.length < 3) {
                answer += answer.last()
            }
        }
    
        return answer
    }
}