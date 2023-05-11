class Solution {
    fun solution(sides: IntArray): Int {
        var a = mutableListOf<Int>()
        var b = mutableListOf<Int>()
        
        for(i in sides.sorted().last()-sides.sorted().first()+1..sides.sorted().last()) a.add(i)
        for(i in sides.sorted().last() + 1 until sides.sum()) b.add(i)
        return a.size + b.size
    }
}