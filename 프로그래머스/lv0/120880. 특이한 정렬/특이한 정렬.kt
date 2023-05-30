class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
         val minusList = mutableListOf<Int>()
         for (i in numlist) minusList.add(i - n)
         val nums = mutableListOf<Int>()
         var num = 0
        
        while (true) {
            var plus = 0
            var minus = 0
            if (nums.size == numlist.size) break

            for(i in minusList){
                if(Math.abs(i) == num) {
                    if(i == 0) nums.add(numlist[minusList.indexOf(i)])
                    if(i < 0) minus = i else plus = i
                }
            }
            // 양수만 있을 경우
            if(plus != 0 && minus == 0) nums.add(numlist[minusList.indexOf(plus)])
            // 음수만 있을 경우
            if(plus == 0 && minus != 0) nums.add(numlist[minusList.indexOf(minus)])
            // 양수 음수 있을 경우
            if(plus != 0 && minus != 0) {
                nums.add(numlist[minusList.indexOf(plus)])
                nums.add(numlist[minusList.indexOf(minus)])
            }
            num++
        }
         
        return nums.toIntArray()
    }
}