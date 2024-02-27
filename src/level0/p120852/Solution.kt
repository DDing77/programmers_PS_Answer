package level0.p120852

/**
 * Author : DDing77
 * Problem Name: 소인수분해
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120852
 */

class Solution {

    fun solution(n: Int): IntArray {

        var primes: Array<Boolean> = Array(10001) { true }
        var answer = arrayListOf<Int>()

        primes[0] = false
        primes[1] = false

        for (i: Int in 2..Math.sqrt(10000.0).toInt()) {
            if (primes[i]) {
                for (j: Int in i * 2..10000 step (i)) {
                    primes[j] = false
                }
            }
        }

        for (i in 2..10000) {
            if (primes[i]) {
                if (n % i == 0) {
                    answer.add(i)
                }
            }
        }

        return answer.toIntArray()
    }
}