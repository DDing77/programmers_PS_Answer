package level0.p181902

/**
 * Author : DDing77
 * Problem Name: 문자 개수 세기
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181902
 */

class Solution {

    fun solution(my_string: String): IntArray {
        var answer = IntArray(52)

        my_string.forEach {
            if (it.isUpperCase()) {
                answer[it.toInt() - 65]++
            } else {
                answer[it.toInt() - 71]++
            }
        }

        return answer
    }
}