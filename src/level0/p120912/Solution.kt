package level0.p120912

/**
 * Author : DDing77
 * Problem Name: 7의 개수
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120912
 */

class Solution {

    fun solution(array: IntArray) = array.joinToString("").count { it == '7' }
}