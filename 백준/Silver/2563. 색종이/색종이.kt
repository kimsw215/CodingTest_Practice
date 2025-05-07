fun main() {
    val arr = Array(101, {IntArray(101)})
    var cnt = 0
    for(n in 0 until readln().toInt()) {
        val mat = readln().split(" ").map{it.toInt()}
        val x = mat[0] - 1
        val y = mat[1] - 1
        for(i in x until x + 10) {
            for(j in y until y + 10) {
                if(arr[i][j] == 1) continue
                arr[i][j] = 1
                cnt++
            }
        }
    }
    println(cnt)
}