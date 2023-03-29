class Solution {
    fun solution(hp: Int): Int {
        val arr = mutableListOf<Int>()
        arr.add( hp / 5)
        arr.add( (hp%5)/3 )
        arr.add( ((hp%5)%3)/1)
        return arr.sum()
    }
}