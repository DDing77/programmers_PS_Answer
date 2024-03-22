package level3.p12907;

/**
 * Author : DDing77
 * Problem Name : 거스름돈
 * Level : 3
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12907
 */

class Solution {

    public int solution(int n, int[] money) {

        int[][] dp = new int[money.length + 1][n + 1];

        for (int i = 0; i <dp.length ; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= money.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= money[i - 1]) {
                    dp[i][j] = dp[i][j - money[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[money.length][n];
    }
}
