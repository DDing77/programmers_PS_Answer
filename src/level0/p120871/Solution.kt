package level0.p120871

/**
 * Author : DDing77
 * Problem Name: 저주의 숫자 3
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120871
 */

class Solution {

    fun solution(n: Int): Int {

        var answer: Int = 0

        for (i in 1..n) {
            answer++;
            while (answer % 3 == 0 || answer.toString().contains('3')) {
                answer++;
            }
        }

        return answer
    }
}