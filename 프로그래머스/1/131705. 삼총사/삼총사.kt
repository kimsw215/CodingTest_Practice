class Solution {
    fun solution(number: IntArray): Int {
        val result = mutableListOf<Int>()
        
        for (i in 0 until number.size -2 ){
            for (j in i + 1 until number.size -1) {
                for (k in j + 1 until number.size) {
                    result.add(number[i] + number[j] + number[k])
                }
            }
        }
        
        return result.count{it == 0}
    }
}