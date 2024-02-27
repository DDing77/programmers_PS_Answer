package level0.p181872

/**
 * Author : DDing77
 * Problem Name: 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181872
 */

class Solution {

    fun solution(myString: String, pat: String): String =
        Regex("[a-zA-Z]*$pat").find(myString)?.value ?: ""
}