fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val nList = readln().split(" ").map { it.toInt() }
    val mList = readln().split(" ").map { it.toInt() }
    val nHash = hashSetOf<Int>()
    val mHash = hashSetOf<Int>()

    val nHashCopy = hashSetOf<Int>()
    val mHashCopy = hashSetOf<Int>()

    for(i in nList) {
        nHash.add(i)
        nHashCopy.add(i)
    }

    for(i in mList) {
        mHash.add(i)
        mHashCopy.add(i)
    }

    for(i in nHash) mHashCopy.remove(i)
    for(j in mHash) nHashCopy.remove(j)

    println("${mHashCopy.size + nHashCopy.size}")
}