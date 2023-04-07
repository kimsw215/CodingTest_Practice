class Solution {
    fun solution(n: Int): Int {
        for(i in 1..10){
            if(n == (1..i).fold(1){total, next ->  total * next}){
                return i
            }
            else if(n < (1..i).fold(1){total, next ->  total * next})
                return i-1
        }
        return 0
    }
}