fun main() {
    val s = readln()
    val sList = mutableSetOf<String>()
    for(i in 0 .. s.length) {
        for(j in i+1 .. s.length) {
            sList.add(s.substring(i,j))
        }
    }
    println(sList.size)
}