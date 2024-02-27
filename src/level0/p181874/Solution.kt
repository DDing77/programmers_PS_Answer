package level0.p181874

/**
 * Author : DDing77
 * Problem Name: A 강조하기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181874
 */

class Solution {

    fun solution(myString: String): String {
        var answer = StringBuilder(myString.lowercase())

        answer.forEachIndexed { index, c ->
            if (c == 'a') {
                answer[index] = 'A'
            }
        }
        return answer.toString()
    }
}