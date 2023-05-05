class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        val moved = mutableListOf<Int>(0,0)
        
        for(i in keyinput){
            when(i){
            "left" -> {
                if(moved[0] <= - board[0]/2) continue
                moved[0] -= 1
            }
            "right" -> {
                if(moved[0] >= board[0]/2) continue
                moved[0] += 1
            }
            "up" -> {
                if(moved[1] >= board[1]/2) continue
                moved[1] += 1
            }
            "down" -> {
                if(moved[1] <= -board[1]/2) continue
                moved[1] -= 1
            }
        }
        }
        
        
        return moved.toIntArray()
    }
}