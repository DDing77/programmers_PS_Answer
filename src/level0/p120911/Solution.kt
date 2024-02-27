package level0.p120911

/**
 * Author : DDing77
 * Problem Name: 문자열 정렬하기 (2)
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */

class Solution {

    fun solution(my_string: String) = my_string.lowercase().toCharArray().sorted().joinToString("")
}