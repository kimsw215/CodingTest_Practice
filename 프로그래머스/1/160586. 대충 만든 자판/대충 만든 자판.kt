class Solution {
    fun solution(keymaps: Array<String>, targets: Array<String>): IntArray {
        val costMap = mutableMapOf<Char, Int>()

        // 1단계: 모든 자판을 훑으면서, 글자마다 "가장 적은 타수"만 남기기
        for (keymap in keymaps) {
            for ((index, key) in keymap.withIndex()) {
                val cost = index + 1
                costMap[key] = minOf(costMap.getOrDefault(key, Int.MAX_VALUE), cost)
            }
        }

        // 2단계: 각 target 단어의 타수를 costMap 기준으로 합산
        return targets.map { word ->
            var total = 0
            for (c in word) {
                val cost = costMap[c] ?: return@map -1   // 아예 못 만드는 글자면 -1
                total += cost
            }
            total
        }.toIntArray()
    }
}