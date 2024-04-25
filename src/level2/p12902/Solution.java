package level2.p12902;

/**
 * Author : DDing77
 * Problem Name : 3 x n 타일링
 * Level : 2
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12902
 */

class Solution {

    public static final int MOD = 1_000_000_007;

    public int solution(int n) {

        if (n % 2 == 1) {
            return 0;
        }

        long[] dp = new long[n / 2];
        dp[0] = 3;
        dp[1] = 11;

        long sum = 0L;
        for (int i = 2; i < n / 2; i++) {
            sum += dp[i - 2] * 2;
            dp[i] = (2 + dp[i - 1] * 3 + sum) % MOD;
        }

        return (int) dp[n / 2 - 1];
    }
}