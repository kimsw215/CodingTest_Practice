class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        val a = my_string[num1]
        val b = my_string[num2]
        for(i in 0 until my_string.length){
            if(i == num1) answer += b
            else if(i == num2) answer += a
            else answer += my_string[i]
        }
        return answer
    }
}