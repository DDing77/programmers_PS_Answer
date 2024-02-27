package level0.p181891

/**
 * Author : DDing77
 * Problem Name: 순서 바꾸기
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181891
 */

class Solution {

    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in n until num_list.size) {
            answer += num_list[i]
        }

        for (i in 0 until n) {
            answer += num_list[i]
        }

        return answer
    }
}