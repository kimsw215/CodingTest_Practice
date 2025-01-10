class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        val card1: MutableList<String> = mutableListOf()
        val card2: MutableList<String> = mutableListOf()
        for(i in cards1) card1.add(i)
        for(i in cards2) card2.add(i)
        
        for(i in goal) {
            if(card1.size != 0 && card1.first() == i) {
                card1.removeAt(0)
                continue
            } else if(card2.size != 0 && card2.first() == i) {
                card2.removeAt(0)
                continue
            } else {
                answer = "No"
                break
            }
        }
        
        return answer
    }
}