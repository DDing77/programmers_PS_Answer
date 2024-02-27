package level0.p120835

/**
 * Author : DDing77
 * Problem Name: 진료순서 정하기
 * Level : 0
 * Language : Kotlin
 * Category : Sort
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120835
 */

class Solution {

    fun solution(emergency: IntArray): IntArray {

        var answer: IntArray = intArrayOf()
        var temp = emergency.sortedArrayDescending()

        emergency.forEach {
            answer += temp.indexOf(it) + 1
        }

        return answer
    }
}