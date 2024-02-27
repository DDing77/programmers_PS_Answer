package level0.p120878

/**
 * Author : DDing77
 * Problem Name: 유한소수 판별하기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120878
 */

class Solution {

    fun getGCD(a: Int, b: Int): Int {
        if (b == 0) {
            return a
        }
        return getGCD(b, a % b)
    }

    fun solution(a: Int, b: Int): Int {
        var denominator = b / getGCD(a, b)

        while (denominator % 2 == 0) {
            denominator /= 2
        }

        while (denominator % 5 == 0) {
            denominator /= 5
        }

        if (denominator != 1) {
            return 2
        } else {
            return 1
        }
    }
}