class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val list = arrayOf('R','T','C','F','J','M','A','N')
        val rowCol = mutableMapOf<Char, Int>()
        var answer: String = ""
        
        // 각 유형에 점수 넣기
        for(num in 0 until survey.size) {
            when(choices[num]) {
                1 -> {
                    rowCol[survey[num][0]] = rowCol.getOrDefault(survey[num][0], 0) + 3
                }
                2 -> {
                    rowCol[survey[num][0]] = rowCol.getOrDefault(survey[num][0], 0) + 2
                }
                3 -> {
                    rowCol[survey[num][0]] = rowCol.getOrDefault(survey[num][0], 0) + 1
                }
                5 -> {
                    rowCol[survey[num][1]] = rowCol.getOrDefault(survey[num][1], 0) + 1
                }
                6 -> {
                    rowCol[survey[num][1]] = rowCol.getOrDefault(survey[num][1], 0) + 2
                }
                7 -> {
                    rowCol[survey[num][1]] = rowCol.getOrDefault(survey[num][1], 0) + 3
                }
            }
        }
        
        // 점수 비교하기
        // 인덱스: 0,1 // 2,3 // 4,5 // 6,7
        for(i in 1 .. 8 step 2) {
            if(rowCol.getOrDefault(list[i], 0) > rowCol.getOrDefault(list[i-1], 0) ) {
                answer += list[i]
            } else if(rowCol.getOrDefault(list[i], 0) <= rowCol.getOrDefault(list[i-1], 0) ) {
                answer += list[i-1]
            }
        }
        
        return answer
    }
}