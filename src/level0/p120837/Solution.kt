package level0.p120837

/**
 * Author : DDing77
 * Problem Name: 개미 군단
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120837
 */

class Solution {

    fun solution(hp: Int): Int {

        var answer: Int = 0
        var remain = hp

        answer += remain / 5
        remain %= 5

        answer += remain / 3
        remain %= 3

        answer += remain

        return answer
    }
}