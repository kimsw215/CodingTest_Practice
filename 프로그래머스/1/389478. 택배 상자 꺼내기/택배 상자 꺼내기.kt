class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        var answer: Int = 0
        val rows = (n + w - 1) / w
        val grid = Array(rows) { IntArray(w) }  // 전부 0 = 빈칸
        var (x,y) = 0 to 0
        
        for (box in 1..n) {
            val r = (box - 1) / w               // 몇 번째 행 (0이 맨 아래)
            val k = (box - 1) % w               // 그 행에서 몇 번째로 놓이는지
            val c = if (r % 2 == 0) k else w - 1 - k   // 홀수 번째 행은 오른쪽부터
            grid[r][c] = box
        }
        
        outer@ for(i in 0 until rows) {
            for(j in 0 until w) {
                if(grid[i][j] == num) {
                    x = i
                    y = j
                    break@outer
                }
            }
        }
           
        var topRow = if (grid[rows-1][y] != 0) rows-1 else rows-2
        answer = topRow - x + 1
        
        return answer
    }
}