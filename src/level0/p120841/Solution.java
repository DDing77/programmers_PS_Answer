package level0.p120841;

/**
 * Author : DDing77
 * Problem Name: 점의 위치 구하기
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120841
 */

public class Solution {

    public int solution(int[] dot) {

        int x = dot[0];
        int y = dot[1];

        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}
