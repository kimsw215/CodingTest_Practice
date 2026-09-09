class Solution {
    fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
        var answer: Int = 0
        
        for(i in 0 until schedules.size) {
            var hour = schedules[i] / 100
            var minute = schedules[i] % 100 + 10
            if(minute >= 60) {
                hour += 1
                minute -= 60
            }
            val time = hour * 100 + minute
            
            var dayCnt = startday
            var cnt = 0
            for(j in timelogs[i]) {
                if(dayCnt % 8 == 6) {
                    dayCnt++
                    continue
                } else if(dayCnt % 8 == 7) {
                    dayCnt = 1
                    continue
                }
                
                dayCnt++
                if(j > time) cnt++
                
            }
            if(cnt == 0) answer++
        }
        
        return answer
    }
}