class Solution {
    fun solution(numbers: String): Long {
        val nums = listOf<String>(
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine")
        val mut = mutableListOf<Int>()
        var str = ""
        for(i in numbers){
            str += i
            if(str in nums){
                mut.add(nums.indexOf(str))
                str = ""
            }
        }
        return mut.joinToString("").toLong()
    }
}