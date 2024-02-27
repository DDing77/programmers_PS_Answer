package level0.p181846

import java.math.BigInteger

/**
 * Author : DDing77
 * Problem Name: 두 수의 합
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181846
 */

class Solution {

    fun solution(a: String, b: String) = BigInteger(a).add(BigInteger(b)).toString()
}