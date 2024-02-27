package level0.p120924

/**
 * Author : DDing77
 * Problem Name: 다음에 올 숫자
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120924
 */

class Solution {

    fun solution(common: IntArray): Int {
        var answer: Int = 0

        if ((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common.last() + (common[1] - common[0])
        } else {
            answer = common.last() * (common[1] / common[0])
        }
        return answer
    }
}