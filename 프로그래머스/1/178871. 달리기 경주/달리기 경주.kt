class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val result = mutableMapOf<String, Int>()
        players.mapIndexed { index, s -> result[s] = index }
        
        for (i in callings) {
            // 현재 선수의 인덱스(순위)
            val cur_player_idx = result[i] ?: 0
            // 앞 순위 선수의 이름
            val front_player = players[cur_player_idx - 1]
    
            players[cur_player_idx - 1] = i
            players[cur_player_idx] = front_player

            result[front_player] = cur_player_idx
            result[i] = cur_player_idx - 1
        }
       
        return players
    }
}