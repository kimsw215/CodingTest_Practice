class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(i in 1..n){
            if( (6*i) % n == 0 ){
            answer = i
            break
            }
        }
        return answer
        // return (1..n).filter{ 6*it % n == 0 }.first()
        // 한 줄로 할 수도 있음 , 다만 시간이 70배 정도 늘어났음
    }
}
