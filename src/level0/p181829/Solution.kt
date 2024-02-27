package level0.p181829

/**
 * Author : DDing77
 * Problem Name: 이차원 배열 대각선 순회하기
 * Level : 0
 * Language : Kotlin
 * Category : Array, Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181829
 */

class Solution {

    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0

        for (i in board.indices) {
            for (j in board[i].indices) {
                if (i + j <= k) {
                    answer += board[i][j]
                }
            }
        }

        return answer
    }
}