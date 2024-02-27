package level0.p120839

/**
 * Author : DDing77
 * Problem Name: 가위 바위 보
 * Level : 0
 * Language : Kotlin
 * Category : Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120839
 */

class Solution {

    fun solution(rsp: String): String {

        var answer: String = ""

        rsp.map {
            if (it == '0') {
                answer += "5"
            } else if (it == '2') {
                answer += "0"
            } else {
                answer += "2";
            }
        }

        return answer
    }
}