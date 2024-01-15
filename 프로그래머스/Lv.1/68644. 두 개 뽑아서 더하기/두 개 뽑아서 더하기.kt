class Solution {
    fun solution(numbers: IntArray): IntArray {
        val result = mutableListOf<Int>()
        
        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                result.add(numbers[i] + numbers[j])
            }
        } 
        return result.toHashSet().sorted().toIntArray()
    }
}