class Solution {
    fun solution(n: Int): IntArray {
        val mut = mutableListOf<Int>()
        for(i in 1..n){
            if(n % i == 0 ) mut.add(i)
        }
        return mut.toIntArray()
    }
}