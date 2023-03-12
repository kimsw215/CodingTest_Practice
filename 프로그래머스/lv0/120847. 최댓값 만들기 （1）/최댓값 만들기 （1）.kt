class Solution {
    fun solution(numbers: IntArray): Int {
        val number = numbers
        val number1: Int = number.sorted().last()
        val number2: Int = number.sorted().slice(0..number.size-2).last()
        
        return number1 * number2
    }
}