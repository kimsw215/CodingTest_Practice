class Solution {
    fun solution(a: Int, b: Int): Int {
        if((a.toString()+b.toString()).toInt() > 2 * a * b) 
            return (a.toString()+b.toString()).toInt()
        else return 2 * a * b
    }
}