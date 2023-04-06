class Solution {
    fun solution(n: Int): Int {
        var a = 0
        var b = 0
        for(i in 1..n){
            for(j in 1..i){
                if(i % j == 0) b += 1
            }
            if(b >= 3){
                a += 1
            }
            b = 0
        }
        return a
    }
}