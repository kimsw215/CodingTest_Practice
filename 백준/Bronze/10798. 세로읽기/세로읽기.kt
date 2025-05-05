fun main() {
    var result = StringBuilder()
    val list = mutableListOf<String>()
    repeat(5) {
        list.add(readln())
    }

    val maxLength = list.maxOf { it.length }

    for(col in 0 until maxLength) {
        for(row in 0 until 5) {
            if(col < list[row].length) {
                result.append(list[row][col])
            }
        }
    }
    println(result)
}