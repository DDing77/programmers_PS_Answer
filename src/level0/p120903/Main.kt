package level0.p120903

/**
 * Author : DDing77
 * Problem Name: 배열의 유사도
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */

class Solution {

    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for (str in s1) {
            if (s2.contains(str)) {
                answer++
            }
        }
        return answer
    }
}
