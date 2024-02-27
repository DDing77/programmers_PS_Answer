package level0.p120905

/**
 * Author : DDing77
 * Problem Name: n의 배수 고르기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120905
 */

class Solution {

    fun solution(n: Int, numlist: IntArray) = numlist.filter { it >= n && it % n == 0 }
}