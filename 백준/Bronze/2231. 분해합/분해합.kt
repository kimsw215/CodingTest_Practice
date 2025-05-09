fun main() {
    val N = readln().toInt()
    var answer = 0
    for(i in 0 until N) {
        if(i + divde(i) == N){
            answer = i
            break
        }
    }
    if(answer != 0) println(answer) else println("0")
}

fun divde(num: Int): Int = num.toString().toList().map { it.toString().toInt() }.sum()