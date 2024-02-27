package level0.p120882

/**
 * Author : DDing77
 * Problem Name: 등수 매기기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120882
 */

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