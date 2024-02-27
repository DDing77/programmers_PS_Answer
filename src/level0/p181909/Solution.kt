package level0.p181909

/**
 * Author : DDing77
 * Problem Name: 접미사 배열
 * Level : 0
 * Language : Kotlin
 * Category : String, Sort
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181909
 */

class Solution {

    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (i in my_string.indices) {
            answer += my_string.substring(i)
        }

        return answer.sortedArray()
    }
}