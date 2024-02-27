package level0.p120893

import java.lang.StringBuilder

/**
 * Author : DDing77
 * Problem Name: 대문자와 소문자
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120893
 */

class Solution {

    fun solution(my_string: String): String {
        var sb: java.lang.StringBuilder = StringBuilder()

        for (i: Int in my_string.indices step (1)) {
            var ch: Char = my_string[i]
            if (ch in 'a'..'z') {
                sb.append(ch.uppercaseChar())
            } else {
                sb.append(ch.lowercaseChar())
            }
        }
        return sb.toString()
    }
}