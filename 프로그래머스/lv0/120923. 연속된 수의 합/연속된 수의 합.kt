class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var sum = 0
        var first = 0
        val mut = mutableListOf<Int>()
        
        for(i in -100..100){
            for(j in i until i + num){
                sum += j
            }
            if(total == sum) first = i
            sum = 0
        }

        for(i in first until first + num){
            mut.add(i)
        }
    
        return mut.toIntArray()
    }
}