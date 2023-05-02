class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        val mut = mutableListOf<String>()
        
        for (i in 0 until quiz.size) {
            val num = quiz[i].split(" ")
            if (num[1] == "+") {
                if (num[0].toInt() + num[2].toInt() == num[4].toInt()) mut.add("O")
                else mut.add("X")
            } else if (num[1] == "-") {
                if (num[0].toInt() - num[2].toInt() == num[4].toInt()) mut.add("O")
                else mut.add("X")
            }
        }
        
        return mut.toTypedArray()
    }
}