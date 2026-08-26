class Solution {
    fun solution(keymaps: Array<String>, targets: Array<String>): IntArray {
    val costMap = mutableMapOf<Char, Int>()
    for (keymap in keymaps) {
        for ((index, key) in keymap.withIndex()) {
            val cost = index + 1
            costMap[key] = minOf(costMap.getOrDefault(key, Int.MAX_VALUE), cost)
        }
    }

    val answer = mutableListOf<Int>()

    for (word in targets) {
        var total = 0
        var possible = true

        for (c in word) {
            val cost = costMap[c]
            if (cost == null) {
                possible = false
                break   // 이 단어는 더 볼 필요 없음, for문만 탈출
            }
            total += cost
        }

        if (possible) {
            answer.add(total)
        } else {
            answer.add(-1)
        }
    }

    return answer.toIntArray()
}
}