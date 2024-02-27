package level0.p181929

/**
 * Author : DDing77
 * Problem Name: 원소들의 곱과 합
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181929
 */

class Solution {

    fun solution(num_list: IntArray): Int {
        var mul = 1
        var sum = 0

        num_list.forEach {
            mul *= it
            sum += it
        }

        if (mul < sum * sum) {
            return 1
        } else {
            return 0
        }
    }
}