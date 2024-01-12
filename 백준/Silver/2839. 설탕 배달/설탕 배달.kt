import java.util.Scanner
fun main(args: Array<String>) = with(Scanner(System.`in`)){
    var n = nextInt()
    val anw = mutableListOf<Int>()
    (0..n / 3).map { i -> (0..n / 5).forEach { j -> if (3 * i + 5 * j == n) anw.add(i + j) } }
    println(if (anw.isNotEmpty()) anw.sorted().first() else -1)
}