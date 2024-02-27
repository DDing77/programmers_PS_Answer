package level0.p181941

/**
 * Author : DDing77
 * Problem Name: 문자 리스트를 문자열로 변환하기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */

class Solution {
    fun solution(arr: Array<String>): String {
        var answer: String = ""
        arr.forEach {
            answer += it
        }
        return answer
    }
}