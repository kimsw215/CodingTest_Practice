fun main() {
    val rom = readLine().toString()
    val reverse = rom.reversed()
    println(if(rom == reverse) 1 else 0)
}