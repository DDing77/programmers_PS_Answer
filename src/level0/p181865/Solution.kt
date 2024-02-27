package level0.p181865

/**
 * Author : DDing77
 * Problem Name: 간단한 식 계산하기
 * Level : 0
 * Language : Kotlin
 * Category : String, Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181865
 */

class Solution {

    fun solution(binomial: String) = binomial.split(" ").let {
        if (it[1] == "+") {
            it[0].toInt() + it[2].toInt();
        } else if (it[1] == "-") {
            it[0].toInt() - it[2].toInt();
        } else {
            it[0].toInt() * it[2].toInt();
        }
    }
}