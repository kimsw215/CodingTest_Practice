class Solution {
    fun solution(elements: IntArray): Int {
        var answer = mutableSetOf<Int>()
        val n = elements.size
        val doubleElements = elements + elements
        
        for(length in 1 .. n) {
            for(i in 0 until n) {
                answer.add(doubleElements.sliceArray(i until i + length).sum())
            }
        }
        
        return answer.size
    }
}