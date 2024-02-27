package level0.p120904

/**
 * Author : DDing77
 * Problem Name: 숫자 찾기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120904
 */

class Solution {

    fun solution(num: Int, k: Int): Int {
        var answer = num.toString().indexOfFirst { it == k.digitToChar() }

        if (answer != -1) {
            answer++
        }

        return answer
    }
}