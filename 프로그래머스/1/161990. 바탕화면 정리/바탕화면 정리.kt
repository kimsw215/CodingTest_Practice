class Solution {
    fun solution(wallpaper: Array<String>): IntArray {    
        val rowArr = mutableListOf<Int>()
        val colArr = mutableListOf<Int>()
        
        for(i in 0 until wallpaper.size) {
            for(j in 0 until wallpaper[i].length) {
                if(wallpaper[i][j] == '#') {
                    rowArr.add(i)
                    colArr.add(j)
                }
            }
        }
        rowArr.sort()
        colArr.sort()
        
        return intArrayOf(rowArr.first(), colArr.first(), rowArr.last() + 1, colArr.last() + 1)
    }
}