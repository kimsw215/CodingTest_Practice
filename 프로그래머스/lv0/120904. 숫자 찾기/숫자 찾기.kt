class Solution {
    fun solution(num: Int, k: Int): Int {
        if(num.toString().indexOf(k.toString()) != -1) 
            return num.toString().indexOf(k.toString()) + 1
        else return -1
    }
}