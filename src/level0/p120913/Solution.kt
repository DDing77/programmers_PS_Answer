package level0.p120913

/**
 * Author : DDing77
 * Problem Name: 잘라서 배열로 저장하기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120913
 */

class Solution {

    fun solution(my_str: String, n: Int): ArrayList<String> {
        var answer = ArrayList<String>()

        var length = my_str.length
        var idx = 0
        for (i in 0..length - 1 step (n)) {
            if (i + n <= length) {
                answer.add(my_str.substring(i, i + n))
            } else {
                answer.add(my_str.substring(i))
            }
        }

        return answer
    }
}