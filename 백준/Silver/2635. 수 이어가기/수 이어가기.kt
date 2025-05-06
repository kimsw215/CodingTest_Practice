fun main() {
    var first = readln().toInt()
    var maxList = mutableListOf<Int>()
    
    for(i in first downTo 1) {
        var curList = mutableListOf<Int>()
        curList.add(first)
        curList.add(i)
        
        while (true) {
            var result = curList[curList.lastIndex - 1] - curList[curList.lastIndex]
            if(result < 0) break
            curList.add(result)
        }
        if(curList.size > maxList.size) maxList = curList
    }
    println(maxList.size)
    maxList.forEach { print("${it} ") }
}