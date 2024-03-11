package level3.p12971;

/**
 * Author : DDing77
 * Problem Name: 스티커 모으기(2)
 * Level : 3
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12971
 */

class Solution {

    public int solution(int sticker[]) {

        if (sticker.length == 1) {
            return sticker[0];
        }

        if (sticker.length == 2) {
            return Math.max(sticker[0], sticker[1]);
        }

        int[] dp = new int[sticker.length];

        dp[0] = sticker[0];
        dp[1] = sticker[0];
        for (int i = 2; i < sticker.length - 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sticker[i]);
        }

        int pickOne = dp[sticker.length - 2];

        dp[0] = 0;
        dp[1] = sticker[1];
        for (int i = 2; i < sticker.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sticker[i]);
        }

        return Math.max(pickOne, dp[dp.length - 1]);
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{1}));
    }
}
