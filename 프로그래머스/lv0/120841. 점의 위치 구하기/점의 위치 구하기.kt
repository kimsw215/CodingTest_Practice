class Solution {
    fun solution(dot: IntArray): Int {
        val num = dot
        val anw: Int = 
            if(num[0] > 0 && num[1] > 0) 1
            else if(num[0] < 0 && num[1] > 0) 2
            else if(num[0] < 0 && num[1] < 0) 3
            else 4
        
        return anw
    }
}