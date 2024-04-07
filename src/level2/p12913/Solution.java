package level2.p12913;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : 땅따먹기
 * Level : 2
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12913
 */

class Solution {

    int solution(int[][] land) {

        int answer = 0;

        int[][] dp = new int[land.length][land[0].length];

        for (int i = 0; i < land[0].length; i++) {
            dp[0][i] = land[0][i];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                for (int k = 0; k < dp[0].length; k++) {
                    if (j == k) {
                        continue;
                    }
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][k]);
                }
                dp[i][j] += land[i][j];
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        for (int i = 0; i < dp[0].length; i++) {
            answer = Math.max(answer, dp[dp.length - 1][i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
    }
}