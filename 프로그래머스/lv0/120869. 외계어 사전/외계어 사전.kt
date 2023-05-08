class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        if(true in dic.map { spell.sorted().joinToString("") in it.toList().sorted().joinToString("") }) return 1 else return 2
    }
}