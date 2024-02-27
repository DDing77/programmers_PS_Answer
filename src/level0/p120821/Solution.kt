package level0.p120821

/**
 * Author : DDing77
 * Problem Name: 배열 뒤집기
 * Level : 0
 * Language : Kotlin
 * Category : Implementation, Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */

class Solution {

    fun solution(num_list: IntArray): IntArray {

        var answer: IntArray = IntArray(num_list.size)

        for (i in num_list.size - 1 downTo 0) {
            answer[num_list.size - 1 - i] = num_list[i];
        }

        return answer
    }
}