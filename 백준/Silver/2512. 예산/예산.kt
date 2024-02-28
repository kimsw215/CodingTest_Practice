fun main() {
    val n = readln().toInt()
    val ns = readln().split(" ").map { it.toInt() }.sorted()
    val result = readln().toInt()

    var start = 1
    var end = ns.last()
    
    while (start <= end) {
        val mid = ( start + end ) / 2
        var money = 0
        for( i in ns ) {
            if( i - mid > 0) money += mid
            else money += i
        }
        if(money <= result) start = mid + 1 else end = mid - 1
    }

    println(end)
}