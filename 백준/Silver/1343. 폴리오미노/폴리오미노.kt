fun main() {
    var n = readln().replace("XXXX","AAAA").replace("XX","BB")
    println( if(n.contains('X') ) -1 else n )
}