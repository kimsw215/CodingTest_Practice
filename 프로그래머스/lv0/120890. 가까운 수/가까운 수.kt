class Solution {
    fun solution(array: IntArray, n: Int): Int {
    val mut = mutableListOf<Int>()
    for(i in array.sorted()) mut.add(Math.abs(n-i))
        return array.sorted()[mut.indexOf(mut.sorted().first())]
    }
}