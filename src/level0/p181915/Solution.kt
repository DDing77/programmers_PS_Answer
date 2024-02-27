package level0.p181915

/**
 * Author : DDing77
 * Problem Name: 글자 이어 붙여 문자열 만들기
 * Level : 0
 * Language : Kotlin
 * Category : String, Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */

class Solution {

    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""

        index_list.forEach {
            answer += my_string[it]
        }

        return answer
    }
}