class Solution {
    fun solution(numbers: IntArray): IntArray {
        val mut = mutableListOf<Int>()
        numbers.forEach{
            mut.add(it*2)
        }
        return mut.toIntArray()
    }
}