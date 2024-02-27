package level0.p181924

/**
 * Author : DDing77
 * Problem Name: 수열과 구간 쿼리 3
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181924
 */

class Solution {

    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()

        queries.map {
            var temp = arr[it[0]];
            arr[it[0]] = arr[it[1]];
            arr[it[1]] = temp
        }

        return arr
    }
}