class Solution {
    fun solution(numbers: IntArray): Int {
        val a = numbers.sorted().take(2).fold(1){acc, i -> acc * i}
        val b = numbers.sorted().takeLast(2).fold(1){acc, i -> acc * i}
    
        if(a >= b) return a else return b
        // if 문을 사용하지 않고 max문으로도 사용 가능하다
        // return Math.max(numbers.sorted().take(2).fold(1){acc, i -> acc * i}, numbers.sorted().takeLast(2).fold(1){acc, i -> acc * i})
    }
}
