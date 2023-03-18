class Solution {
    fun solution(array: IntArray): Int {
        val mut = mutableListOf<Int>()
        var cnt = 0
        
        for( i in array.iterator()) mut.add(i)
        
        val keyOfmax = mut.groupingBy { it }.eachCount().maxByOrNull { it.value }!!.key // 최빈값의 키: 3
        val ValueOfmax = mut.groupingBy { it }.eachCount().maxByOrNull { it.value }!!.value // 최빈값의밸류: 3
        
        var arr = mut.groupingBy { it }.eachCount().toList()
        
        for( (k,v) in arr) if(ValueOfmax == v) cnt ++
        
        return if( cnt != 1) -1 else keyOfmax
        
        
    }
}