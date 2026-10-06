class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        var str = s
        var binaryCnt = 0
        var zeroCnt = 0
        
        while(str != "1") {
            var before = str.length
            if(str.contains('0')) {
                str = str.replace("0","")
            }
            var after = str.length
            zeroCnt += before - after
            
            str = after.toString(2)
            binaryCnt++
        }
        
        answer[0] = binaryCnt
        answer[1] = zeroCnt
        
        return answer
    }
}