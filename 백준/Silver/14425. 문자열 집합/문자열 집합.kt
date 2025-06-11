fun main() {
    val NM = readln().split(" ").map{ it.toInt() }
    val n = NM[0]
    val m = NM[1]
    val nArr = mutableListOf<String>()
    val mArr = mutableListOf<String>()
    var cnt = 0
    for(i in 0 until n) nArr.add(readln())
    for(i in 0 until m) mArr.add(readln())
    val mArrMap = mArr.withIndex().groupBy({it.value}, {it.index}).mapValues{ it.value.size }
    for(i in mArrMap) {
        if(i.key in nArr) cnt+= i.value
    }
    println(cnt)
}