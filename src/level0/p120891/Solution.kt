package level0.p120891

/**
 * Author : DDing77
 * Problem Name: 369게임
 * Level : 0
 * Language : Kotlin
 * Category : String, Math, Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120891
 */

class Solution {

    fun solution(order: Int) = order.toString().length - order.toString().replace("[369]".toRegex(), "").length
}