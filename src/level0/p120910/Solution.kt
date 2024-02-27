package level0.p120910

/**
 * Author : DDing77
 * Problem Name: 세균 증식
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120910
 */

class Solution {

    fun solution(n: Int, t: Int): Int = Math.pow(2.toDouble(), t.toDouble()).toInt() * n
}