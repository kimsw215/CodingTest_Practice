class Solution {
    fun solution(n: Int): IntArray {
        val mut = mutableListOf<Int>()
        var cnt = 2
        var num = n
        while(num > 1){
            if(num % cnt == 0){
                mut.add(cnt)
                num /= cnt
            } else cnt++
        }
        return mut.toSet().toIntArray()
    }
}