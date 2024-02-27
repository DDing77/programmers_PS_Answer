package level0.p120896

import java.util.*

/**
 * Author : DDing77
 * Problem Name: 한 번만 등장한 문자
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120896
 */

class Solution {

    var alpha: IntArray = IntArray(26, { 0 })

    fun solution(s: String): String {
        var sb = StringBuilder();

        for (i: Char in s) {
            alpha[i - 'a']++;
        }

        println(Arrays.toString(alpha))

        for (i: Int in alpha.indices) {
            if (alpha[i] == 1) {
                sb.append((i + 'a'.code).toChar());
            }
        }
        return sb.toString();
    }
}