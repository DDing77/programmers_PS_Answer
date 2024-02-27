package level0.p120861

/**
 * Author : DDing77
 * Problem Name: 캐릭터의 좌표
 * Level : 0
 * Language : Kotlin
 * Category : Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120861
 */

class Solution {

    fun solution(keyinput: Array<String>, board: IntArray): IntArray {

        var answer: IntArray = IntArray(2)

        var x = 0
        var y = 0

        keyinput.map {
            if (it.equals("left")) {
                if (x - 1 >= -board[0] / 2) {
                    x--
                }
            } else if (it.equals("right")) {
                if (x + 1 <= board[0] / 2) {
                    x++
                }
            } else if (it.equals("up")) {
                if (y + 1 <= board[1] / 2) {
                    y++
                }
            } else {
                if (y - 1 >= -board[1] / 2) {
                    y--
                }
            }
        }
        answer[0] = x
        answer[1] = y

        return answer
    }
}