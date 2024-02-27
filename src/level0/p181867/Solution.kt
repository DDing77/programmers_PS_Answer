package level0.p181867

/**
 * Author : DDing77
 * Problem Name: x 사이의 개수
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */

class Solution {

    fun solution(myString: String) = myString.split("x").map {
        it.length
    }.toIntArray()
}