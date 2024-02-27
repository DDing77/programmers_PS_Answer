package level0.p181918

/**
 * Author : DDing77
 * Problem Name: 배열 만들기 4
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181918
 */

class Solution {

    fun solution(arr: IntArray): IntArray {
        var stk: IntArray = intArrayOf()

        var idx = 0;
        while (idx < arr.size) {
            if (stk.isEmpty()) {
                stk += arr[idx]
                idx++
            } else if (stk.last() < arr[idx]) {
                stk += arr[idx]
                idx++
            } else {
                stk = stk.dropLast(1).toIntArray()
            }
        }

        return stk
    }
}