package level0.p120848;

/**
 * Author : DDing77
 * Problem Name: 팩토리얼
 * Level : 0
 * Language : Kotlin
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120848
 */

class Solution {

    public int solution(int n) {

        int answer = 0;
        int temp = 1;

        for (int i = 1; i <= 10; i++) {
            temp *= i;
            if (temp > n) break;
            answer = i;
        }

        return answer;
    }
}