class Solution {
    fun solution(letter: String): String {   
        val morse = arrayListOf<String>(
        ".-","-...","-.-.","-..",".", // a = 97 b c d e
        "..-.","--.","....","..",".---", // f g h i j
        "-.-",".-..","--","-.","---", // k l m n o
        ".--.","--.-",".-.","...","-", // p q r s t
        "..-","...-",".--","-..-","-.--", // u v w x y
        "--..") // z
        return letter.split(" ").map{ (morse.indexOf(it) + 97 ).toChar() }.joinToString("")
    }
}