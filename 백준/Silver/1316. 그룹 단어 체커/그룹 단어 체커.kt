fun main() {
    var num = readLine().toString().toInt()
    var answer = 0 
    
    for(order in 0 until num) {
        var word = readLine().toString().toMutableList()
        val wordMap = word.withIndex().groupBy({it.value}, {it.index}).mapValues{ it.value.size}
        for(i in wordMap) {
            for(j in 0 until i.value) {
                if(word.first() == i.key) word.remove(word.first()) else break
            }
        }
        if(word.size == 0) answer++
    }
    print(answer)
}