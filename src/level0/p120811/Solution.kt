package level0.p120811

/**
 * Author : DDing77
 * Problem Name: 중앙값 구하기
 * Level : 0
 * Language : Kotlin
 * Category : Sort
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120811
 */

class Solution {

    fun solution(array: IntArray): Int {
        return array.sorted()[array.size / 2]
    }
}