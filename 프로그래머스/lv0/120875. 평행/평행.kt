class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val mut = mutableListOf<Int>()
        var answer: Int = 0
        
        val first_num1 = dots[1][1] - dots[0][1] // 1. 첫 번째 직선 분자
        val first_deno1 = dots[1][0] - dots[0][0] // 1. 첫 번째 직선 분모

        val first_num2 = dots[3][1] - dots[2][1] // 1. 두 번째 직선 분자
        val first_deno2 = dots[3][0] - dots[2][0] // 1. 두 번째 직선 분모

        val second_num1 = dots[2][1] - dots[0][1] // 2. 첫 번째 직선 분자
        val second_deno1 = dots[2][0] - dots[0][0] // 2. 첫 번째 직선 분모

        val second_num2 = dots[3][1] - dots[1][1] // 2. 두 번째 직선 분자
        val second_deno2 = dots[3][0] - dots[1][0] // 2. 두 번째 직선 분모

        val third_num1 = dots[3][1] - dots[0][1] // 3. 첫 번째 직선 분자
        val third_deno1 = dots[3][0] - dots[0][0] // 3. 첫 번째 직선 분모

        val third_num2 = dots[2][1] - dots[1][1] // 3. 두 번째 직선 분자
        val third_deno2 = dots[2][0] - dots[1][0] // 3. 두 번째 직선 분모
        
        if(first_num1.toDouble() / first_deno1.toDouble() == first_num2.toDouble() / first_deno2.toDouble()) mut.add(1)
        if(second_num1.toDouble() / second_deno1.toDouble() == second_num2.toDouble() / second_deno2.toDouble()) mut.add(1)
        if(third_num1.toDouble() / third_deno1.toDouble() == third_num2.toDouble() / third_deno2.toDouble()) mut.add(1)

        if(1 in mut) answer = 1
        
        return answer
    }
}