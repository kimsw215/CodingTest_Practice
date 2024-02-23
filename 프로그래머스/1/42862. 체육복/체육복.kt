class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var mLost = mutableListOf<Int>()
        var mReserve = mutableListOf<Int>()
        var answer = 0
        
        lost.forEach { mLost.add(it) }
        reserve.forEach { mReserve.add(it) }
        
        mLost.sort()
        
        for(i in 1..n) {
            if(i in mLost && i in mReserve) {
                mReserve.remove(i)
                mLost.remove(i)
            }
        }
        
        for (i in 1..n) {
            if (i in mLost) {
                if (i - 1 in mReserve) {
                    mReserve.remove(i - 1)
                    mLost.remove(i)
                } else if (i + 1 in mReserve) {
                    mReserve.remove(i + 1)
                    mLost.remove(i)
                }
            }
        }
        
        answer = n - mLost.size
        
        return answer
    }
}