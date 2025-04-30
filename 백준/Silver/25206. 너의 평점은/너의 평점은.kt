fun main() {
    var sum = 0.0
    var scoreSum = 0.0
    
    for(i in 0 until 20) {
        val subject = readLine().toString().split(" ")
        val score = subject[1].toDouble()
        val grade = gradeToScore(subject[2])
        if(grade != -1.0) {
            sum += score * grade
            scoreSum += score
        }
    }
    println(sum / scoreSum)
}

fun gradeToScore(grade: String): Double {
    return when(grade) {
        "A+" -> 4.5
        "A0" -> 4.0
        "B+" -> 3.5
        "B0" -> 3.0
        "C+" -> 2.5
        "C0" -> 2.0
        "D+" -> 1.5
        "D0" -> 1.0
        "F" -> 0.0
        else -> -1.0
    }
}