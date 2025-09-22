import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val wordlist = mutableMapOf<String, Int>()

    repeat(n) {
        val word = br.readLine()
        if (word.length >= m) {
            wordlist[word] = wordlist.getOrDefault(word, 0) + 1
        }
    }

    val sortedWords = wordlist.entries.sortedWith(
        compareByDescending<Map.Entry<String, Int>> { it.value }
            .thenByDescending { it.key.length }
            .thenBy { it.key }
    )

    val sb = StringBuilder()
    sortedWords.forEach { sb.append("${it.key}\n") }
    print(sb)
}