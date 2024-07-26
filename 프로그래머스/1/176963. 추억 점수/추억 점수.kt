class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val answer = photo.map { arr -> arr.sumOf {  if(it in name) yearning[name.indexOf(it)] else 0 } }.toIntArray()
        return answer
    }
}