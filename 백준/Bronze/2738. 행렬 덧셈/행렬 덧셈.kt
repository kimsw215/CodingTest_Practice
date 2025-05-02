fun main() {
    val mat = readLine().toString().split(" ").map{ it.toInt() }
    val arr = Array(mat[0], {IntArray( mat[1], {0} ) } )
    
    for(n in 0 until 2) {
        for( col in 0 until mat[0]) {
            val list = readLine().toString().split(" ").map{ it.toInt() }
            for(row in 0 until mat[1]) arr[col][row] += list[row]
        }
    }
    for(i in 0 until mat[0]) {
        for(j in 0 until mat[1]) {
            print("${arr[i][j]} ")
        }
        println()
    }
}