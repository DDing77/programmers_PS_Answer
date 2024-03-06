package level3.p43105;

/**
 * Author : DDing77
 * Problem Name: 정수 삼각형
 * Level : 3
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/43105
 */

class Solution {

    public int solution(int[][] triangle) {

        int[][] dp = new int[triangle.length + 1][triangle.length + 1];

        dp[0][0] = triangle[0][0];
        for (int i = 0; i < triangle.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + triangle[i + 1][j]);
                dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + triangle[i + 1][j + 1]);
            }
        }


        int answer = 0;

        for (int i = 0; i < dp.length; i++) {
            answer = Math.max(dp[dp.length - 2][i], answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        test.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
    }
}
