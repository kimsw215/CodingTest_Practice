class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer = ""
        var log = 0
        for(i in db){
            if(id_pw[0] == i[0]){
                log = 0
                if(id_pw[1] == i[1]) return "login" else return "wrong pw"
            } else log = 1
        }
        if(log == 1) answer = "fail"
        return answer
    }
}