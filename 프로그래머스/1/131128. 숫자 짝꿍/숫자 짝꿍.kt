class Solution {
    fun solution(X: String, Y: String): String {
        var xHashMap = mutableMapOf<Char, Int>()
        var yHashMap = mutableMapOf<Char, Int>()
        var common = mutableListOf<Char>()
        
        for(i in X) xHashMap[i] = xHashMap.getOrDefault(i, 0) + 1
        for(i in Y) yHashMap[i] = yHashMap.getOrDefault(i, 0) + 1
        
        for(digit in '0'..'9') {
            val cntX = xHashMap.getOrDefault(digit, 0)
            val cntY = yHashMap.getOrDefault(digit, 0)
            val minCount = minOf(cntX, cntY)

            repeat(minCount) {
                common.add(digit)
            }
        }
        if(common.isEmpty()) {
            return "-1"
        } else {
            common.sortDescending()
            if(common.size >= 2) {
                if(common.first() == '0') return "0"
                else return common.joinToString("")
            } else {
                return common.joinToString("")
            }
        }
    }
}