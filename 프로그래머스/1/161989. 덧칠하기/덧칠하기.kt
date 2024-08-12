class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        val mut = mutableListOf<Int>()
        var answer: Int = 0
        var idx = section.first()
        for(i in 0 .. n) if(!section.contains(i)) mut.add(i) else mut.add(0)
        
        while(idx <= n) {
            if(mut[idx] == 0) {
                answer++
                idx += m
            } else idx++
        }
        
        return answer
    }
}