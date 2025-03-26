class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var size: Int = score.size / m
        val list = mutableListOf<Int>()
        val box = mutableListOf<Int>()
        
        score.map{ list.add(it) }
        list.sort()
        
        for(i in 0 until size) {
            box.add( list[list.size - m] * m )
            for(j in 0 until m) list.removeAt(list.size - 1)
        }
        
        return box.sum()
    }
}