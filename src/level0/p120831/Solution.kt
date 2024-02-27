package level0.p120831

/**
 * Author : DDing77
 * Problem Name: 짝수의 합
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120831
 */

class Solution {

    fun solution(n: Int) = (1..n).filter { it % 2 == 0 }.sum()
}