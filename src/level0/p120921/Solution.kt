package level0.p120921

/**
 * Author : DDing77
 * Problem Name: 문자열 밀기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120921
 */

class Solution {

    fun solution(A: String, B: String): Int {
        var answer: Int = 0
        var temp: String = A

        for (i in A) {
            if (temp.equals(B)) {
                return answer
            }
            answer++
            temp = temp.last() + temp.substring(0, temp.lastIndex)
        }

        return -1
    }
}