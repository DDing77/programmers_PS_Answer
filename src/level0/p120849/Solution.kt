package level0.p120849

/**
 * Author : DDing77
 * Problem Name: 모음 제거
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */

class Solution {

    fun solution(my_string: String): String {

        var sb = StringBuilder()

        for (i in my_string.indices) {
            var cur = my_string.get(i)
            if (cur != 'a' && cur != 'e' && cur != 'i' && cur != 'o' && cur != 'u') {
                sb.append(cur)
            }
        }
        return sb.toString()
    }
}