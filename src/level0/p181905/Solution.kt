package level0.p181905

/**
 * Author : DDing77
 * Problem Name: 문자열 뒤집기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181905
 */

class Solution {

    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string

        queries.forEach {
            answer = answer.substring(0, it[0]) +
                    answer.substring(it[0]..it[1]).reversed() +
                    answer.substring(it[1] + 1)
        }

        return answer
    }
}