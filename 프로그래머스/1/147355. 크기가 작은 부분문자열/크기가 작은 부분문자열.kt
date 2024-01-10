class Solution {
    fun solution(t: String, p: String): Int {
        
        val mut = t.map { i -> i.toString().toLong() }
        val com = mutableListOf<Long>()
        
        for(i in 0 .. t.length - p.length){
            var num = ""
            for(j in 0 until  p.length){
                num += t[i+j].toString()
            }
            com.add(num.toLong())
        }
        
        return com.filter { i -> i <= p.toLong()}.count()
    }
}