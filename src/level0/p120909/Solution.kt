package level0.p120909

import kotlin.math.sqrt

/**
 * Author : DDing77
 * Problem Name: 제곱수 판별하기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */

class Solution {

    fun solution(n: Int): Int {
        if (sqrt(n.toDouble()) % 1.0 == 0.0) {
            return 1
        } else {
            return 2
        }
    }
}