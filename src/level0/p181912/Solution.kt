package level0.p181912

/**
 * Author : DDing77
 * Problem Name: 배열 만들기 5
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181912
 */

class Solution {

    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()

        intStrs.forEach {
            if (it.substring(s, s + l).toInt() > k) {
                answer += it.substring(s, s + l).toInt()
            }
        }
        return answer
    }
}