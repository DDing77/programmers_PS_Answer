package level0.p120814;

/**
 * Author : DDing77
 * Problem Name: 피자 나눠 먹기 (1)
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120814
 */

class Solution {

    public int solution(int n) {

        int answer = n / 7;

        if (n % 7 != 0) {
            answer++;
        }

        return answer;
    }
}
