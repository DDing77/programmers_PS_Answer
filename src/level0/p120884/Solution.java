package level0.p120884;

/**
 * Author : DDing77
 * Problem Name: 치킨 쿠폰
 * Level : 0
 * Language : Java
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120884
 */

class Solution {

    public int solution(int chicken) {
        int answer = 0;

        while (chicken > 0) {
            answer += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }

        return answer;
    }
}