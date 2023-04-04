class Solution {
    fun solution(numbers: IntArray): Int {
        val a = numbers.sorted().take(2).fold(1){acc, i -> acc * i}
        val b = numbers.sorted().takeLast(2).fold(1){acc, i -> acc * i}
    
        if(a >= b) return a else return b
    }
}