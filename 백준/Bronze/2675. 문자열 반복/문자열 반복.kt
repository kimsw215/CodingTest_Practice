fun main() {
    var num = readLine().toString().toInt()
    
    for(i in 0 until num) {
        var answer = ""
        val s = readLine().toString()
        val t = s.split(" ")[0].toInt()
        val w = s.split(" ")[1]
        for(i in w) {
            var word = ""
            for(j in 0 until t) word += i
            answer += word
        }
        println(answer)
    }
}