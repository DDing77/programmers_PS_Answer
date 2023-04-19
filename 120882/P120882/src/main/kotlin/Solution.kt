class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        val length = score.size
        val rank = IntArray(length)

        rank.fill(1)

        for (i in rank.indices) {
            for (j in rank.indices) {
                if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) {
                    rank[i]++
                }
            }
        }

        return rank
    }
}