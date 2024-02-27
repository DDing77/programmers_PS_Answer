package level0.p120907

/**
 * Author : DDing77
 * Problem Name: OX퀴즈
 * Level : 0
 * Language : Kotlin
 * Category : String, Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */

class Solution {

    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        quiz.forEach {
            var temp: Array<String> = it.split("[ =]".toRegex()).toTypedArray()

            if (temp[1] == "-") {
                if (temp[5].toInt() == temp[0].toInt() - temp[2].toInt()) {
                    answer += "O"
                } else {
                    answer += "X"
                }
            } else {
                if (temp[5].toInt() == temp[0].toInt() + temp[2].toInt()) {
                    answer += "O"
                } else {
                    answer += "X"
                }
            }
        }
        return answer
    }
}