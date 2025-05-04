fun main() {
    var col = 1
    var maxCol = 1
    var row = 1
    var maxRow = 1
    var maxNum = 0
    for(i in 0 until 9) {
        val numList = readLine().toString().split(" ").map{ it.toInt() }
        row = 1
        for(j in numList) {
            if(maxNum <= j) {
                maxCol = col
                maxRow = row
                maxNum = j
            }
            row++
        }
        col++
    }
    println(maxNum)
    println("${maxCol} ${maxRow}")
}