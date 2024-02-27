package level0.p181888

/**
 * Author : DDing77
 * Problem Name: n개 간격의 원소들
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181888
 */

class Solution {

    fun solution(num_list: IntArray, n: Int): IntArray =
        num_list.filterIndexed { index, i -> index % n == 0 }.toIntArray()
}