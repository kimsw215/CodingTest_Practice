class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        val mut = mutableListOf<Int>()
        val rank = mutableListOf<Int>()
        
        for(i in score) mut.add(i.sum())
        for(i in 0 until mut.size) rank.add(mut.sorted().reversed().indexOf(mut[i]) + 1)
        
        return rank.toIntArray()
    }
}