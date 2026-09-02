class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var moveHand = mutableListOf<Char>()
        var lc = 3 to 0 // *
        var rc = 3 to 2 // #
        
        for(i in numbers) {
            when(i) {
                1,4,7 -> {
                    lc = getRowCol(i)
                    moveHand.add('L')
                }
                3,6,9 -> {
                    rc = getRowCol(i)
                    moveHand.add('R')
                }
                2,5,8,0 -> {
                    if( distance(lc,getRowCol(i)) < distance(rc, getRowCol(i)) ) {
                        lc = getRowCol(i)
                        moveHand.add('L')
                    } else if( distance(lc,getRowCol(i)) > distance(rc, getRowCol(i)) ) {
                        rc = getRowCol(i)
                        moveHand.add('R')
                    } else {
                        if(hand == "right") {
                        rc = getRowCol(i)
                        moveHand.add('R')
                        } else {
                            lc = getRowCol(i)
                            moveHand.add('L')
                        }
                    }
                }
            }
        }
        
        return moveHand.joinToString("")
    }
    
    fun getRowCol(num: Int): Pair<Int, Int> {
        if(num == 0) return 3 to 1
        val row = (num - 1) / 3
        val col = (num - 1) % 3
        return row to col
    }
    fun distance(a: Pair<Int, Int>, b: Pair<Int, Int>): Int {
        return Math.abs(a.first - b.first) + Math.abs(a.second - b.second)
    }
}