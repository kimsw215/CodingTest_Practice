class Solution {
    fun solution(lines: Array<IntArray>): Int {
        val arr = IntArray(200)
        lines.forEach {
            val front = it[0] + 100
            val back = it[1] + 100
            for(i in front until back) arr[i]++
        }
           
        return arr.count{ it > 1 }
    }
        
}