class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for( i in my_string) if(i.toInt() <= 90) answer += i.toLowerCase() else answer += i.toUpperCase()
        // if(i.isUpperCase()) c += i.toLowerCase()  else c += i.toUpperCase()
        return answer
    }
}
