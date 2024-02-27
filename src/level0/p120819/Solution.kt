package level0.p120819

/**
 * Author : DDing77
 * Problem Name: 아이스 아메리카노
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120819
 */

class Solution {

    fun solution(money: Int): IntArray {

        var answer: IntArray = IntArray(2)

        answer[0] = money / 5500
        answer[1] = money % 5500

        return answer
    }
}