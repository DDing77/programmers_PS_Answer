package level0.p120844

/**
 * Author : DDing77
 * Problem Name: 배열 회전시키기
 * Level : 0
 * Language : Kotlin
 * Category : Implementation, Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120844
 */

class Solution {

    fun solution(numbers: IntArray, direction: String): IntArray {

        var temp = ArrayDeque<Int>()

        numbers.map {
            temp.add(it)
        }

        if (direction.equals("left")) {
            temp.addLast(temp.removeFirst())
        } else {
            temp.addFirst(temp.removeLast())
        }

        return temp.toIntArray()
    }
}