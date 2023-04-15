class Solution {
    fun solution(my_string: String): Int {
        var sum = 0
        var num = 1
        my_string.split(" ").forEach {
            if(it == "+") {
                num *= 1 }
            else if ( it == "-"){
              num *= -1   
            } 
            else {
                sum += num * it.toInt()
                num = 1
            }
        }
        return sum
    }
}