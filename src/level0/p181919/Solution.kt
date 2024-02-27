package level0.p181919

/**
 * Author : DDing77
 * Problem Name: 콜라츠 수열 만들기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181919
 */

class Solution {

    fun solution(n: Int) = mutableListOf<Int>().apply {
        add(n)

        while (last() != 1) {
            if (last() % 2 == 0) {
                add(last() / 2)
            } else {
                add(3 * last() + 1)
            }
        }
    }.toIntArray()
}