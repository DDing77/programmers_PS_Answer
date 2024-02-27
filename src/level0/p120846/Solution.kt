package level0.p120846

/**
 * Author : DDing77
 * Problem Name: 합성수 찾기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120846
 */

class Solution {

    fun solution(n: Int): Int {

        var answer: Int = 0
        var primes = BooleanArray(n + 1);

        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (!primes[i]) {
                for (j in i * 2..n step (i)) {
                    primes[j] = true
                }
            }
        }

        for (i in 1..n) {
            if (primes[i]) {
                answer++
            }
        }

        return answer
    }
}