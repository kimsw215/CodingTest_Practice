class Solution {
    fun solution(s: String): IntArray {
        val mut = s.toMutableList()
        val list = mutableListOf<Int>()

        for(i in 0 until mut.size) {
            val last = s.slice(0 until i).toList()
            val cnt = last.lastIndexOf(s[i])
            if(s[i] in last) list.add(i - cnt) else list.add(cnt)
        }
        
        return list.toIntArray()
    }
}