package level0.p120956

/**
 * Author : DDing77
 * Problem Name: 옹알이 (1)
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */

class Solution {

    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0

        for (i in 0 until babbling.size) {
            babbling[i] = babbling[i].replaceFirst("(aya)".toRegex(), "-")
            babbling[i] = babbling[i].replaceFirst("(ye)".toRegex(), "-")
            babbling[i] = babbling[i].replaceFirst("(woo)".toRegex(), "-")
            babbling[i] = babbling[i].replaceFirst("(ma)".toRegex(), "-")
            babbling[i] = babbling[i].replace("-", "")
            if (babbling[i] == "") {
                answer++
            }
            println(babbling[i])
        }

        return answer
    }
}