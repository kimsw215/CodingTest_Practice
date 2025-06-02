fun main() {
    val arr = mutableListOf<Pair<Int,String>>()
    for(i in 0 until readln().toInt()) {
        val an = readln().split(" ")
        val age = an[0].toInt()
        val name = an[1]
        arr.add(Pair(age,name))
    }
    arr.sortBy { it.first }
    for(i in arr) println("${i.first} ${i.second}")
}