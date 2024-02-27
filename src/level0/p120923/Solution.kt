package level0.p120923

import java.util.*

/**
 * Author : DDing77
 * Problem Name: 연속된 수의 합
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */

class Solution {

    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = IntArray(num)

        var start = Math.ceil(total.toDouble() / num - Math.floor(num.toDouble() / 2)).toInt()
        for (i in 0 until num) {
            answer[i] = start + i
        }

        println(Arrays.toString(answer))
        return answer
    }
}