package level3.p161988;

/**
 * Author : DDing77
 * Problem Name : 연속 펄스 부분 수열의 합
 * Level : 3
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/161988
 */

class Solution {

    public long solution(int[] sequence) {

        long answer = Integer.MIN_VALUE;
        int length = sequence.length;
        long[] dp1 = new long[length + 1];
        long[] dp2 = new long[length + 1];
        int purse = 1;

        for (int i = 1; i <= length; i++) {
            dp1[i] = Math.max(dp1[i - 1] + sequence[i - 1] * purse * 1, sequence[i - 1] * purse * 1);
            dp2[i] = Math.max(dp2[i - 1] + sequence[i - 1] * purse * -1, sequence[i - 1] * purse * -1);
            answer = Math.max(answer, Math.max(dp1[i], dp2[i]));
            purse *= -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{2, 3, -6, 1, 3, -1, 2, 4}));
    }
}
