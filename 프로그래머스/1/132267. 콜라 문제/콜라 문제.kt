class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var total = n
        var answer = 0
        while(total >= a) {
            // 교환 후 받은 병의 수
            answer += (total / a) * b
            // 교환 후 받은 병의 수 + 나머지 병의 수
            total = (total / a) * b + total % a
            }
        return answer
    }
}