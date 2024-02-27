package level1.p132267;

/**
 * Author : DDing77
 * Problem Name: 콜라 문제
 * Level : 1
 * Language : Java
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */

class Solution {

    public int solution(int a, int b, int n) {
        int answer = 0;
        int nCola;

        while (n >= a) {
            answer += (n / a) * b;
            n = n % a + (n / a) * b;
        }

        return answer;
    }
}