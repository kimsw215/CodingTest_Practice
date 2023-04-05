class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val m = mutableListOf<Int>()
        m.addAll(numbers.toMutableList())
        var v = 0
        when(direction){
            "right" -> {
                v = m.removeLast()
                m.add(0,v)
            }
            "left" -> {
                v = m.removeFirst()
                m.add(v)
            }
        }
        return m.toIntArray()
    }
}