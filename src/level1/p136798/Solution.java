package level1.p136798;

/**
 * Author : DDing77
 * Problem Name: 기사단원의 무기
 * Level : 1
 * Language : Java
 * Category : Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/136798
 */

class Solution {

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt;
        for (int i = 1; i <= number; i++) {
            cnt = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (j * j == i) cnt++;
                else if (i % j == 0) cnt += 2;
            }

            if (cnt <= limit) {
                answer += cnt;
            } else {
                answer += power;
            }
        }

        return answer;
    }
}