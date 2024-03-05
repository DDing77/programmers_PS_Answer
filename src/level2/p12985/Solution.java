package level2.p12985;

/**
 * Author : DDing77
 * Problem Name: 예상 대진표
 * Level : 2
 * Language : Java
 * Category : Game-Theory
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12985
 */

class Solution {

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            answer++;
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }

        return answer;
    }
}