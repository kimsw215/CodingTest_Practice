class Solution {
    fun solution(age: Int): String {
        val a = arrayListOf("a","b","c","d","e","f","g","h","i","j")
        var answer: String = ""
        for(i in age.toString()){
            answer += a[i.digitToInt()]
        }
        return answer
    }
}