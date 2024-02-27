package level0.p120815

/**
 * Author : DDing77
 * Problem Name: 피자 나눠 먹기 (2)
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120815
 */

class Solution {

    fun getGCD(a: Int, b: Int): Int {

        if (b == 0) {
            return a
        }
        return getGCD(b, a % b)
    }

    fun solution(n: Int): Int {

        return n / getGCD(n, 6)
    }
}