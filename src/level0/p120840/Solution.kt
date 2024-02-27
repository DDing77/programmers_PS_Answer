package level0.p120840

/**
 * Author : DDing77
 * Problem Name: 구슬을 나누는 경우의 수
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120840
 */

class Solution {

    fun combination(n: Int, r: Int): Int {
        if (n == r || r == 0) {
            return 1
        }

        return combination(n - 1, r - 1) + combination(n - 1, r)
    }

    fun solution(balls: Int, share: Int): Int {
        return combination(balls, share)
    }
}