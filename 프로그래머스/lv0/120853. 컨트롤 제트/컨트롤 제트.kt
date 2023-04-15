class Solution {
    fun solution(s: String): Int {
        var sum: Int = 0
        for(i in 0 until s.split(" ").size){
            if(s.split(" ")[i] != "Z") sum += s.split(" ")[i].toInt()
             else sum -= s.split(" ")[i-1].toInt()
        }
        return sum
    }
}