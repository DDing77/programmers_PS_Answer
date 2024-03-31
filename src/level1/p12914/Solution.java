package level1.p12914;

/**
 * Author : DDing77
 * Problem Name : 멀리 뛰기
 * Level : 2
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12914
 */

class Solution {

    public long solution(int n) {

        if (n <= 3) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }

        return dp[n];
    }
}