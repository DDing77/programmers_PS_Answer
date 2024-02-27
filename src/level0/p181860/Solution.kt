package level0.p181860

/**
 * Author : DDing77
 * Problem Name: 빈 배열에 추가, 삭제하기
 * Level : 0
 * Language : Kotlin
 * Category : Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181860
 */

class Solution {

    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in flag.indices) {
            if (flag[i]) {
                repeat(arr[i] * 2) {
                    answer += arr[i]
                }
            } else {
                answer = answer.copyOfRange(0, answer.size - arr[i])
            }
        }
        return answer
    }
}