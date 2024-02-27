package level0.p181901

/**
 * Author : DDing77
 * Problem Name: 배열 만들기 1
 * Level : 0
 * Language : Kotlin
 * Category : Sort
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181901
 */

class Solution {

    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in k..n step k) {
            answer += i;
        }
        return answer
    }
}