class Solution {
    fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
    
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val num = numer1 * denom2 + numer2 * denom1 // 분자
        val denom = denom1 * denom2 // 분모
        return intArrayOf(num / gcd(num,denom), denom / gcd(num,denom) )
    }
}