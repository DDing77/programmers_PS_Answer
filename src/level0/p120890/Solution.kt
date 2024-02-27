package level0.p120890

/**
 * Author : DDing77
 * Problem Name: 가까운 수
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120890
 */

class Solution {

    fun solution(array: IntArray, n: Int): Int {
        var idx = 0
        var minDiff = Integer.MAX_VALUE

        var sorted = array.sorted()
        for (i in sorted.indices) {
            if (Math.abs(n - sorted[i]) < minDiff) {
                minDiff = Math.abs(n - sorted[i])
                idx = i
            }
        }


        return sorted[idx]
    }
}