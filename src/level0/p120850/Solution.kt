package level0.p120850

/**
 * Author : DDing77
 * Problem Name: 문자열 정렬하기 (1)
 * Level : 0
 * Language : Kotlin
 * Category : String, Sort
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120850
 */

class Solution {

    fun solution(my_string: String): IntArray {

        var answer = mutableListOf<Int>()

        my_string.map {
            if (Character.isDigit(it)) {
                answer.add(it.digitToInt())
            }
        }

        return answer.sorted().toIntArray()
    }
}