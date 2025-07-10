fun main() {
    val n = readln().toInt()
    
    val list = mutableSetOf<String>()
    for(i in 0 until n) {
        val (name, state) = readln().split(" ")
        if(state == "enter") list.add(name) else if(state == "leave" && list.contains(name)) list.remove(name)
    }
    for(i in list.sortedDescending()) {
        println(i)
    }
}