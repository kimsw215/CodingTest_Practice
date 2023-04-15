class Solution {
    fun solution(A: String, B: String): Int {
        var str = A
        var s = ""
        val mut = mutableListOf<String>()
        for(i in 0 until A.length){
            s += str.takeLast(1) 
            for(j in 0 until A.length-1){
                s += str[j] 
            }
            mut.add(s)
            str = s
            s = ""
        }        
        
        if(A == B) return 0
        if(B in mut) return mut.indexOf(B)+1 else return -1
    }
}