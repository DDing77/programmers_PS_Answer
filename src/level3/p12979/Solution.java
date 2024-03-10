package level3.p12979;

/**
 * Author : DDing77
 * Problem Name: 기지국 설치
 * Level : 3
 * Language : Java
 * Category : Greedy, Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12979
 */

class Solution {

    public int solution(int n, int[] stations, int w) {

        int answer = 0;

        int left = 1;
        int right;
        for (int stationIdx : stations) {
            right = stationIdx - w - 1;
            if (left <= right) {
                answer += (right - left + 1 + 2 * w) / (2 * w + 1);
            }
            left = stationIdx + w + 1;
        }


        if (left <= n) {
            answer += (n - left + 1 + 2 * w) / (2 * w + 1);
        }

        return answer;
    }
}
