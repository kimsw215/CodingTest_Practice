fun main() {
    var num = readLine().toString().toInt()
    for(i in 0 until num) {
        var text = readLine().toString()
        println("${text.first()}${text.last()}")
    }
}