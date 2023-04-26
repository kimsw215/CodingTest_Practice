class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var cnt = 0
        var answer: Int = 0
        val mut = mutableListOf<Int>()
        for(i in 0..k){
            for(j in numbers) mut.add(j)
        }
        
        for(i in 0 until mut.size){
            if(i % 2 == 0) cnt++
            if(cnt == k){
                answer = mut[i]
                break
            }
        }
        
        return answer
    }
}