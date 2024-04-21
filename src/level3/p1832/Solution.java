package level3.p1832;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 보행자 천국
 * Level : 3
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/1832
 */

class Solution {

    public static final int MOD = 20170805;

    public int solution(int m, int n, int[][] cityMap) {

        int[][][] dp = new int[m + 1][n + 1][2];
        dp[1][1][0] = 1;
        dp[1][1][1] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (cityMap[i - 1][j - 1] == 1) {
                    continue;
                } else if (cityMap[i - 1][j - 1] == 2) {
                    dp[i][j][0] = dp[i][j - 1][0];
                    dp[i][j][1] = dp[i - 1][j][1];
                } else {
                    dp[i][j][0] += (dp[i][j - 1][0] + dp[i - 1][j][1]) % MOD;
                    dp[i][j][1] += (dp[i][j - 1][0] + dp[i - 1][j][1]) % MOD;
                }
            }
        }

        return dp[m][n][1];
    }
}
