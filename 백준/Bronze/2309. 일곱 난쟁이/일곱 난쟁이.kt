fun main() {
    val mut = mutableListOf<Int>()
    repeat(9){ mut.add(readln().toInt()) }
    mut.sort()

    for(i in 0 until mut.size - 1) {
        val copy:MutableList<Int> = mut
        val a = copy[i]
        for(j in 1 until mut.size) {
            val b = copy[j]
            if(copy.sum() - ( a + b ) == 100) {
                mut.remove(a)
                mut.remove(b)
                break
            }
        }
        if(mut.sum() == 100) break
    }
    for(i in mut) println(i)
}