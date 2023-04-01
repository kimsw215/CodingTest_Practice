class Solution {
    fun solution(my_string: String): IntArray {
        val arr = mutableListOf<Int>()
        for(i in my_string)
        if(i.toInt() <= 57) arr.add(i.toString().toInt())
        return arr.sorted().toIntArray()
    }
}