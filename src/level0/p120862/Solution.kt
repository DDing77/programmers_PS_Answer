package level0.p120862

/**
 * Author : DDing77
 * Problem Name: 최댓값 만들기 (2)
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120862
 */

class Solution {

    fun solution(numbers: IntArray): Int {

        numbers.sort()
        return (numbers[0] * numbers[1]).coerceAtLeast(numbers[numbers.size - 1] * numbers[numbers.size - 2])
    }
}