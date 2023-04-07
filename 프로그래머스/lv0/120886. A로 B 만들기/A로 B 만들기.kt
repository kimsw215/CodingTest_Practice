class Solution {
    fun solution(before: String, after: String): Int {
        for(i in 0 until before.length){
            if( before.toList().sorted()[i] != after.toList().sorted()[i]) return 0
        }
        return 1
    }
}