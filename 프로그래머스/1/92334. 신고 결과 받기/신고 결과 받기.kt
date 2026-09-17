class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val map = mutableMapOf<String, Int>()
        val userGetMail = mutableMapOf<String, Int>()
        
        // key: 신고자 이름, value: 그 사람이 신고한 대상들의 집합
        val reportedBy = mutableMapOf<String, MutableSet<String>>()

        // 몇 번 신고 당했는지
        for(i in id_list) {
            map[i] = map.getOrDefault(i,0)
            userGetMail[i] = userGetMail.getOrDefault(i,0)
        }
        
        // 누가 누굴 신고했는지
        for(i in report) {
            val people = i.split(" ")
            val user = people[0]
            val suspect = people[1]

            // 유저 + 신고한 유저
            reportedBy.getOrPut(user) {mutableSetOf() }.add(suspect)
        }
            // 몇 번 신고됐는지
            for((user, suspect) in reportedBy) {
                for(s in suspect) {
                    map[s] = map.getOrDefault(s,0)+ 1
                }
            }
        
        // 범인 명단
        val suspectList = map.filter { (key,value) -> value >= k }.keys
    
        for(name in id_list) {
            var cnt = 0
            for(j in suspectList) {
                if (j in reportedBy.getOrDefault(name, mutableSetOf())) cnt++
            }
            userGetMail[name] = cnt
        }
        return userGetMail.values.toIntArray()
    }
}