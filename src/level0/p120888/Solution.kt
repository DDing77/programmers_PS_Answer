package level0.p120888

/**
 * Author : DDing77
 * Problem Name: 중복된 문자 제거
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120888
 */

class Solution {

    fun solution(my_string: String): String {
        var answer: String = my_string.toList().distinct().joinToString("")
        return answer
    }
}