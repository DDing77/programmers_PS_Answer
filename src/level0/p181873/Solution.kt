package level0.p181873

/**
 * Author : DDing77
 * Problem Name: 특정한 문자를 대문자로 바꾸기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181873
 */

class Solution {
    fun solution(my_string: String, alp: String) = my_string.replace(alp, alp.uppercase())
}