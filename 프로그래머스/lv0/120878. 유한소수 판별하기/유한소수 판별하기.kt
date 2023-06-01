class Solution {
    fun solution(a: Int, b: Int): Int {
        var gcdNum = gcd(a,b)
        var b2 = b / gcdNum
        
        while(b2 != 1){
            if( b2 % 2 == 0) b2 /= 2 else if( b2 % 5 == 0) b2 /= 5 else return 2
        }
        
        return 1
    }
}

fun gcd(a: Int, b: Int): Int = if(b != 0 ) gcd(b, a % b) else a