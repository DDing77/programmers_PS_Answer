package level3.p118668;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : 코딩 테스트 공부
 * Level : 3
 * Language : Java
 * Category : DP, DFS, Dijkstra
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/118668
 */

class Solution {

    private static final int INF = 123456789;
    private int maxAlp;
    private int maxCop;
    private int[][] dp;

    private int execDFS(int curAlp, int curCop, int[][] problems) {
        if (curAlp >= maxAlp && curCop >= maxCop) {
            return 0;
        }

        if (dp[curAlp][curCop] != INF) {
            return dp[curAlp][curCop];
        }

        dp[curAlp][curCop]++;

        dp[curAlp][curCop] = Math.min(dp[curAlp][curCop], execDFS(Math.min(curAlp + 1, maxAlp), curCop, problems) + 1);
        dp[curAlp][curCop] = Math.min(dp[curAlp][curCop], execDFS(curAlp, Math.min(curCop + 1, maxCop), problems) + 1);

        for (int[] problem : problems) {
            if (curAlp >= problem[0] && curAlp >= problem[1]) {
                dp[curAlp][curCop] = Math.min(dp[curAlp][curCop],
                        execDFS(Math.min(curAlp + problem[2], maxAlp), Math.min(curCop + problem[3], maxCop), problems) + problem[4]);
            }
        }

        return dp[curAlp][curCop];
    }

    public int solution(int alp, int cop, int[][] problems) {
        maxAlp = 0;
        maxCop = 0;
        for (int[] problem : problems) {
            maxAlp = Math.max(maxAlp, problem[0]);
            maxCop = Math.max(maxCop, problem[1]);
        }

        dp = new int[Math.max(alp, maxAlp) + 1][Math.max(cop, maxCop) + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], INF);
        }

        return execDFS(alp, cop, problems);
    }
}
