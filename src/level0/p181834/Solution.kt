package level0.p181834

/**
 * Author : DDing77
 * Problem Name: l로 만들기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181834
 */

class Solution {

    fun solution(myString: String) = myString.replace("[a-k]".toRegex(), "l")
}