package level0.p181843

/**
 * Author : DDing77
 * Problem Name: 부분 문자열인지 확인하기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181843
 */

class Solution {

    fun solution(my_string: String, target: String) = if (my_string.contains(target)) 1 else 0
}