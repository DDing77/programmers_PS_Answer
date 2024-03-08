package level3.p42898;

/**
 * Author : DDing77
 * Problem Name: 등굣길
 * Level : 3
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42898
 */

class Solution {

    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n + 1][m + 1];
        boolean[][] isSink = new boolean[n + 1][m + 1];

        for (int i = 0; i < puddles.length; i++) {
            isSink[puddles[i][1]][puddles[i][0]] = true;
        }

        dp[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (!isSink[i][j]) {
                    dp[i][j] += (dp[i - 1][j] + dp[i][j - 1]) % 1_000_000_007;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(4, 3, new int[][]{{2, 2}}));
    }
}