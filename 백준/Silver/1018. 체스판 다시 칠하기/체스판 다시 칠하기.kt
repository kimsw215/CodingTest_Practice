fun main() {
    val mn = readln().split(" ").map { it.toInt() }
    val board = mutableListOf<MutableList<Char>>()
    var countWB = mutableListOf<Int>()
    for (i in 0 until mn[0]) {
        val word = readln().toMutableList()
        board.add(word)
    }

    for (i in 0 until mn[0] - 7) {
        for (j in 0 until mn[1] - 7) {
            var cntW = 0
            var cntB = 0
            for(row in i until  i + 8) {
                for(col in j until j + 8) {
                    // 패턴 1과 비교
                    if ((row + col) % 2 == 0 && board[row][col] != 'W') cntW++
                    if ((row + col) % 2 != 0 && board[row][col] != 'B') cntW++
                    // 패턴 2와 비교
                    if ((row + col) % 2 == 0 && board[row][col] != 'B') cntB++
                    if ((row + col) % 2 != 0 && board[row][col] != 'W') cntB++
                }
            }
            if(cntW >= cntB) countWB.add(cntB) else countWB.add(cntW)
        }
    }
    println("${countWB.min()}")
}