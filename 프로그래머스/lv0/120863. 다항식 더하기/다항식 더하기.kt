class Solution {
    fun solution(polynomial: String): String {
        var poly = " " + polynomial
        var varcnt = 0
        var numcnt = 0
        var answer = ""
        for(i in polynomial.replace("+"," ").split(" ").filter { it.isNotEmpty() }) {
            if("x" in i){
              if(i.length == 1) varcnt += 1 else varcnt += i.substringBefore("x").toInt()
            } else numcnt += i.toInt()
        }
            if(numcnt != 0 && varcnt == 0) answer = "$numcnt"
            if(numcnt == 0 && varcnt != 0){
            if(varcnt == 1) answer = "x" else answer = "${varcnt}x" 
            }
            if(numcnt != 0 && varcnt != 0) {
            if(varcnt == 1) answer = "x + ${numcnt}" else answer = "${varcnt}x + ${numcnt}"
            }
        
        return answer
    }
}