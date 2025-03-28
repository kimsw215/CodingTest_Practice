class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val result = combinations(nums, 3)
        val list = result.map {it.sum()}
        list.forEach { if(2 == divisors(it)) answer++ }
        return answer
    }
    
    fun combinations(nums: IntArray, r: Int): List<List<Int>> {
        fun combine(start: Int, path: List<Int>): List<List<Int>> {
            if (path.size == r) return listOf(path)

            val result = mutableListOf<List<Int>>() // 결과 저장

            for (i in start until nums.size) {
                result.addAll(combine(i + 1, path + nums[i]))
            }

            return result
        }

        return combine(0, emptyList()) // 초기 값
    }
    
    fun divisors(num: Int): Int {
        var result = 0
        for(i in 1 .. Math.sqrt(num.toDouble()).toInt() ) {
            if (num % i == 0) {
                result++
                if( i != num / i) result++
            }
        }
        return result
    }
}