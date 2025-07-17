import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val nSet = HashSet<String>()
    val result = mutableListOf<String>()

    repeat(n) {
        nSet.add(br.readLine())
    }

    repeat(m) {
        val word = br.readLine()
        if (nSet.contains(word)) {
            result.add(word)
        }
    }

    // 정렬 추가
    result.sort()

    bw.write("${result.size}\n")
    result.forEach { bw.write("$it\n") }

    bw.flush()
    bw.close()
    br.close()
}