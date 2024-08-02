class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var (x, y) = -1 to -1
        for (i in 0 until park.size) {
            for (j in 0 until park[i].length) {
                if (park[i][j] == 'S') {
                    x = i
                    y = j
                }
            }
        }
        
        for (i in routes) {
            val (dir, stepsStr) = i.split(" ")
            val steps = stepsStr.toInt()
            when (dir) {
                "N" -> {
                    var canMove = true
                    if (x - steps >= 0) {
                        for (j in x - steps until x) {
                            if (park[j][y] == 'X') {
                                canMove = false
                                break
                            }
                        }
                    } else {
                        canMove = false
                    }
                    if (canMove) x -= steps
                }

                "S" -> {
                    var canMove = true
                    if (x + steps < park.size) {
                        for (j in x + 1..x + steps) {
                            if (park[j][y] == 'X') {
                                canMove = false
                                break
                            }
                        }
                    } else {
                        canMove = false
                    }
                    if (canMove) x += steps
                }

                "W" -> {
                    var canMove = true
                    if (y - steps >= 0) {
                        for(k in y - steps until y) {
                            if(park[x][k] == 'X') {
                                canMove = false
                                break
                            }
                        }
                    } else {
                        canMove = false
                    }
                    if(canMove) y -= steps
                }

                "E" -> {
                    var canMove = true
                    if (y + steps < park[0].length) {
                        for(k in y + 1 .. y + steps) {
                            if(park[x][k] == 'X') {
                                canMove = false
                                break
                            }
                        }
                    } else {
                        canMove = false
                    }
                    if(canMove) y += steps
                }
            }
        }
        
        return intArrayOf(x,y)
    }
}