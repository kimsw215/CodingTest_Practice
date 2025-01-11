class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var list = mutableListOf<Int>()
        for(i in 1 .. number) {
            list.add(if( divisors(i) <= limit) divisors(i) else power)
        }
        return list.sum()
    }
    fun divisors(num: Int): Int {
        var result = 0
        for(i in 1 .. Math.sqrt(num.toDouble()).toInt() ) {
            if (num % i == 0) {
                result++
                if(i != num / i) result++
            }
        }
        return result
    }
}