import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun <T> joinToString (
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for( (index, element) in collection.withIndex() ) {
        if( index > 0 ) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val que: Queue<Int>  = LinkedList()
    val num = StringTokenizer(readLine())
    val arg = num.nextToken().toInt()
    val cnt = num.nextToken().toInt()

    var mut = mutableListOf<Int>()

    for(i in 1..arg) que.add(i)

    var n = 1

    while ( que.isNotEmpty() ) {
        if(n == cnt){
            mut.add(que.remove())
            n = 1
        } else {
            var rest = que.remove()
            que.add(rest)
            n++
        }
    }

    println( joinToString(mut,", ", "<",">") )
    
}