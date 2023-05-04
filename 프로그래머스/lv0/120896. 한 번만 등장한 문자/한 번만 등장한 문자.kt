class Solution {
    fun solution(s: String): String {
        val mut = mutableListOf<Char>()
        val cnt = mutableListOf<Int>()
        var answer: String = ""
        
        for(i in s.toSet()) mut.add(i) 
        for(i in 0 until mut.size) cnt.add(0)
        
        for(i in s.toList()) if(i in mut.sorted()) cnt[mut.sorted().indexOf(i)] += 1
        for(i in 0 until cnt.size) if(cnt[i] == 1) answer += mut.sorted()[i]
        
        
        return answer
    }
}