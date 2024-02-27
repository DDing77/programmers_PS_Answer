package level0.p181943

/**
 * Author : DDing77
 * Problem Name: 문자열 겹쳐쓰기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */

class Solution {

    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var first: String = my_string.substring(0, s);
        var end = my_string.substring(s + overwrite_string.length)

        return first + overwrite_string + end
    }
}
