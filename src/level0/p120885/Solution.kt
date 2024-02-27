package level0.p120885

/**
 * Author : DDing77
 * Problem Name: 이진수 더하기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120885
 */

class Solution {

    fun solution(bin1: String, bin2: String): String = Integer.toBinaryString(bin1.toInt(2) + bin2.toInt(2))
}