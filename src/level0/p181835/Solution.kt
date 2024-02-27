package level0.p181835

/**
 * Author : DDing77
 * Problem Name: 조건에 맞게 수열 변환하기 3
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181835
 */

class Solution {

    fun solution(arr: IntArray, k: Int) = arr.map { if (k % 2 == 1) it * k else it + k }
}