package level0.p181923

/**
 * Author : DDing77
 * Problem Name: 수열과 구간 쿼리 2
 * Level : 0
 * Language : Kotlin
 * Category : Math, Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */

class Solution {

    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()

        queries.forEach {
            var min = Integer.MAX_VALUE
            var flag = false
            for (i in it[0]..it[1]) {
                if (arr[i] > it[2]) {
                    flag = true
                    min = Math.min(min, arr[i])
                }
            }

            if (!flag) {
                answer += -1
            } else {
                answer += min
            }
        }

        return answer
    }
}