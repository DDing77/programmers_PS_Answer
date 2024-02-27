package level0.p120889

/**
 * Author : DDing77
 * Problem Name: 삼각형의 완성조건 (1)
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */

class Solution {

    fun solution(sides: IntArray): Int = sides.sort().let {
        if (sides[0] + sides[1] > sides[2]) {
            return 1
        } else {
            return 2
        }
    }
}