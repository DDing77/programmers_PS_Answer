package level0.p120829

/**
 * Author : DDing77
 * Problem Name: 각도기
 * Level : 0
 * Language : Kotlin
 * Category : Geometry
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120829
 */

class Solution {

    fun solution(angle: Int): Int {

        return if (angle == 0 || angle == 180) {
            4;
        } else if (angle in 91..179) {
            3;
        } else if (angle == 90) {
            2;
        } else {
            1;
        }
    }
}