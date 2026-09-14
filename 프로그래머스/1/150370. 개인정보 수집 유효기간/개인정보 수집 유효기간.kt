class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        var cnt = 1
        var termsMap = mutableMapOf<String, Int>()
        
        for(i in terms) {
            val parts = i.split(" ")
            val term = parts[0]
            val month = parts[1].toInt()
            termsMap[term] = month
        }
        
        for(i in privacies) {
            // "2021.05.02" 와 A 가 분리
            val parts = i.split(" ")
            val term = parts[1]
            
            // 2021.05.02 를 .으로 분리 -> 2021, 05, 02
            val date = parts[0].split('.')
            
            var year = date[0].toInt()
            var month = date[1].toInt()
            var day = date[2].toInt()
            
            val termMonth = termsMap.getOrDefault(term,0)
            // 먼저 계산을 하고 조건을 따져 22 / month + 6 / day - 1
            month += termMonth
            day -= 1
            if(day < 1) {
                day = 28
                month -= 1
            }
            while(month > 12) {
                month = month - 12
                year += 1
            }
            
            var result = "$year"
            if(month < 10) result += "0$month" else result += month
            if(day < 10) result += "0$day" else result += day

            if(result.toInt() < today.replace(".","").toInt()) {
                answer.add(cnt)
            }
        
            cnt++
        }
        
        return answer.toIntArray()
    }
}