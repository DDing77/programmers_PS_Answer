package level0.p181936

/**
 * Author : DDing77
 * Problem Name: 공배수
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */

class Solution {
    fun solution(number: Int, n: Int, m: Int) = if ((number % n == 0) && (number % m == 0)) 1 else 0
}