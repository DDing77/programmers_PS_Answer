package level0.p120864

/**
 * Author : DDing77
 * Problem Name: 숨어있는 숫자의 덧셈 (2)
 * Level : 0
 * Language : Kotlin
 * Category : String, Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120864
 */

class Solution {

    fun solution(my_string: String): Int =
        my_string.split("[A-z]+".toRegex())
            .filter(String::isNotEmpty)
            .sumOf(String::toInt)
}