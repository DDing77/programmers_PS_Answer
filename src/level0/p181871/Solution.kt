package level0.p181871

/**
 * Author : DDing77
 * Problem Name: 문자열이 몇 번 등장하는지 세기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181871
 */

class Solution {

    fun solution(myString: String, pat: String) = myString.filterIndexed { index, c ->
        index <= myString.length - pat.length && pat.equals(myString.subSequence(index, index + pat.length))
    }.count()
}