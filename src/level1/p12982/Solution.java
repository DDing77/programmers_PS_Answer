package level1.p12982;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 예산
 * Level : 1
 * Language : Java
 * Category : Greedy, Sort
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12982
 */

class Solution {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int cost : d) {
            if (budget - cost < 0) {
                break;
            }
            budget -= cost;
            answer++;
        }
        return answer;
    }
}