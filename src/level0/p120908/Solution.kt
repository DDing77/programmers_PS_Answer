package level0.p120908

/**
 * Author : DDing77
 * Problem Name: 문자열안에 문자열
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */

class Solution {

    fun solution(str1: String, str2: String) = if (str1.contains(str2)) 1 else 2
}