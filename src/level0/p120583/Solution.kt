package level0.p120583

/**
 * Author : DDing77
 * Problem Name: 중복된 숫자 개수
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */

class Solution {

    fun solution(array: IntArray, n: Int) = array.filter { it == n }.count()
}