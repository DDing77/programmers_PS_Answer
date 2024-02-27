package level0.p120809

/**
 * Author : DDing77
 * Problem Name: 배열 두 배 만들기
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */

class Solution {

    fun solution(numbers: IntArray): IntArray {

        var answer: IntArray = IntArray(numbers.size)

        for (i in numbers.indices) {
            answer[i] = numbers[i] * 2;
        }

        return answer
    }
}