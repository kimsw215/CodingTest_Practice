class Solution {
    fun solution(common: IntArray): Int {
        val size = common.size
        var r = 0
        var next = 0
        if(common[1] - common[0] == common[2] - common[1]) {
            r = common[1] - common[0]
            next = 0
        }
        
        else if(common[1] / common[0] == common[2] / common[1]){
            r = common[1] / common[0]   
            next = 1
        }

        if(next == 0) return common[size - 1] + r else return common[size - 1] * r
    }
}