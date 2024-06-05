package level0.p181839;

/**
 * Author : DDing77
 * Problem Name : 주사위 게임 1
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181839
 */

class Solution {

    public int solution(int a, int b) {
        if ((a & 1) == 1 && (b & 1) == 1) {
            return a * a + b * b;
        } else if ((a & 1) == 0 && (b & 1) == 0) {
            return Math.abs(a - b);
        } else {
            return 2 * (a + b);
        }
    }
}