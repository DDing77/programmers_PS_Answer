package level0.p181938;

/**
 * Author : DDing77
 * Problem Name : 두 수의 연산값 비교하기
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */

class Solution {

    public int solution(int a, int b) {
        int temp = 2 * a * b;
        for (int i = 0; i < 1 + (int)Math.log10(b); i++) {
            a *= 10;
        }
        return Math.max(temp, a + b);
    }
}