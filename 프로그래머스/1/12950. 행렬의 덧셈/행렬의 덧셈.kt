class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val value = mutableListOf<IntArray>()
         
        for (i in 0 until arr1.size) {
            val row = IntArray(arr1[i].size)
            for(j in 0 until arr1[i].size) {
                row[j] = arr1[i][j] + arr2[i][j]
            }
            value.add(row)
        }
         
        return value.toTypedArray()
    }
}