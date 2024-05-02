package level3.p1837;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : GPS
 * Level : 3
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/1837
 */

class Solution {

    public int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
        ArrayList<Integer>[] edges = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int[] ints : edge_list) {
            int from = ints[0];
            int to = ints[1];
            edges[from].add(to);
            edges[to].add(from);
        }

        int[][] dp = new int[k][n + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 12345678);
        }

        dp[0][gps_log[0]] = 0;
        for (int i = 1; i < k; i++) {
            for (int j = 0; j <= n; j++) {
                for (int next : edges[j]) {
                    if (next == gps_log[i]) {
                        dp[i][next] = Math.min(dp[i][next], dp[i - 1][j]);
                    } else {
                        dp[i][next] = Math.min(dp[i][next], dp[i - 1][j] + 1);
                    }
                }
            }
        }

        int res = dp[k - 1][gps_log[k - 1]];
        if (res == 12345678) {
            return -1;
        }
        return res;
    }
}
