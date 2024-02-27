package level0.p120897

/**
 * Author : DDing77
 * Problem Name: 약수 구하기
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */

class Solution {

    fun solution(n: Int): IntArray {
        var answer = arrayListOf<Int>()


        for (i in 1..n) {
            if (n % i == 0) {
                answer.add(i);
            }
        }

        return answer.toIntArray();
    }
}