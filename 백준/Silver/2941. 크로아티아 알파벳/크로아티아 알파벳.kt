fun main() {
    val list = "c=|c-|dz=|d-|lj|nj|s=|z=".toRegex()
    var word = readLine().toString()

    println(word.replace(list, "0").count())
}