import kotlin.math.*
class Solution {
    fun solution(n: Int): Int {
        //for(i in 0..n/2) if(i*i == n) return 1        
        //return 2
        
        if( (sqrt(n.toDouble()).toLong() * sqrt(n.toDouble()).toLong()).toInt() == n ) return 1 else return 2
    }
}