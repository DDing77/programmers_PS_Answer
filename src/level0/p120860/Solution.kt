package level0.p120860

/**
 * Author : DDing77
 * Problem Name: 직사각형 넓이 구하기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120860
 */

class Solution {

    fun solution(dots: Array<IntArray>): Int {

        var answer: Int = 0
        var minX = Integer.MAX_VALUE
        var maxX = Integer.MIN_VALUE
        var minY = Integer.MAX_VALUE
        var maxY = Integer.MIN_VALUE

        for (i in dots.indices) {
            minX = Math.min(minX, dots[i][0])
            minY = Math.min(minY, dots[i][1])
            maxX = Math.max(maxX, dots[i][0])
            maxY = Math.max(maxY, dots[i][1])
        }

        answer = (maxX - minX) * (maxY - minY)

        return answer
    }
}