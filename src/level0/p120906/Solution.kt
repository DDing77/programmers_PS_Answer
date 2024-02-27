package level0.p120906

/**
 * Author : DDing77
 * Problem Name: 자릿수 더하기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */

class Solution {

    fun solution(n: Int): Int {
        var answer: Int = 0
        var temp = n

        while (temp > 0) {
            answer += temp % 10
            temp /= 10
        }

        return answer
    }
}