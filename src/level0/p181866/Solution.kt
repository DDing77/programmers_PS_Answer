package level0.p181866

/**
 * Author : DDing77
 * Problem Name: 문자열 잘라서 정렬하기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181866
 */

class Solution {

    fun solution(myString: String): Array<String> {
        return myString.split("x").sorted().filter {
            !it.equals("")
        }.toTypedArray()
    }
}