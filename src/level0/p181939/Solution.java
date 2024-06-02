package level0.p181939;

/**
 * Author : DDing77
 * Problem Name : 더 크게 합치기
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */

class Solution {

    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)),
                Integer.parseInt(String.valueOf(b) + String.valueOf(a)));
    }
}