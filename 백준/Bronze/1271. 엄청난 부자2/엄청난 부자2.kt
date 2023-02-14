import java.util.Scanner
fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val n = readLine()!!.split(" ")
    println(n[0].toBigInteger() / n[1].toBigInteger())
    println(n[0].toBigInteger() % n[1].toBigInteger())
}