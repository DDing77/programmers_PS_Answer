package level0.p120895

import java.util.*

/**
 * Author : DDing77
 * Problem Name: 인덱스 바꾸기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */

class Solution {

    fun solution(my_string: String, num1: Int, num2: Int): String {
        return my_string.toList().let {
            Collections.swap(it, num1, num2)
            it.joinToString { "" }
        }
    }
}