class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var hMax = sizes[0][0]
        for (i in sizes) {
            val max = if (i[0] <= i[1]) i[1] else i[0]
            if (hMax <= max) hMax = max
        }
        
        var maxOfMin = 0
        for (i in sizes) {
            if(i[0] < i[1]) { 
                if( maxOfMin <= i[0]) maxOfMin = i[0] 
            } 
            else { 
                if( maxOfMin <= i[1]) maxOfMin = i[1] 
            }
    }
        
        return hMax * maxOfMin
    }
}