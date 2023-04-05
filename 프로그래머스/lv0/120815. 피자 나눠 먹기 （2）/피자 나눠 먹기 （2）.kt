class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(i in 1..n){
            if( (6*i) % n == 0 ){
            answer = i
            break
            }
        }
        return answer
    }
}