class Solution {
    fun solution(board: Array<IntArray>): Int {
        
        var answer: Int = 0
        
        val mut = Array(board.size) { row -> board[row].copyOf() }
        
        for (i in 0 until board.size) {
            for (j in 0 until board[i].size) {
                if(board[i][j] == 1){
                // 하단
                if(i + 1 >= 0 && i + 1 < board.size){
                    if(j - 1 >= 0 && j - 1 < board[i].size) mut[i+1][j-1] = 1
                    if(j >= 0 && j < board[i].size) mut[i+1][j] = 1
                    if(j + 1 >= 0 && j + 1 < board[i].size) mut[i+1][j+1] = 1
                }

                // 중단
                if(i >= 0 && i < board.size){
                    if(j - 1 >= 0 && j - 1 < board[i].size) mut[i][j-1] = 1
                    if(j + 1 >= 0 && j + 1 < board[i].size) mut[i][j+1] = 1
                }

                // 상단
                if(i - 1 >= 0 && i - 1 < board.size){
                    if(j - 1 >= 0 && j - 1 < board[i].size) mut[i-1][j-1] = 1
                    if(j >= 0 && j < board[i].size) mut[i-1][j] = 1
                    if(j + 1 >= 0 && j + 1 < board[i].size) mut[i-1][j+1] = 1
                    }
                }
            }
        }
        
        for(i in mut){ 
            for(j in i) if(j == 1) answer++
        }
        
        return board.size * board[0].size - answer
    }
}