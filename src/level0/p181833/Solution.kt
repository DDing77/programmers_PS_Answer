package level0.p181833

/**
 * Author : DDing77
 * Problem Name: 특별한 이차원 배열 1
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181833
 */

class Solution {

    fun solution(n: Int): Array<IntArray> = Array(n) { i ->
        IntArray(n) { j ->
            if (i == j) 1 else 0
        }
    }
}