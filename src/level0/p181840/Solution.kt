package level0.p181840

/**
 * Author : DDing77
 * Problem Name: 정수 찾기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181840
 */

class Solution {
    
    fun solution(num_list: IntArray, n: Int): Int {
        if (num_list.contains(n)) {
            return 1
        }
        return 0
    }
}