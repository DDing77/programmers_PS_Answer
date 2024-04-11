package level2.p12905;

/**
 * Author : DDing77
 * Problem Name : 가장 큰 정사각형 찾기
 * Level : 2
 * Language : Java
 * Category : DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12905
 */

class Solution {

    public boolean check(int mid, int[][] prefixSum) {
        for (int i = 1; i <= prefixSum.length - mid; i++) {
            for (int j = 1; j <= prefixSum[i].length - mid; j++) {
                int x = i + mid - 1;
                int y = j + mid - 1;
                int count = prefixSum[x][y] - prefixSum[x][j - 1] - prefixSum[i - 1][y] + prefixSum[i - 1][j - 1];
                if (count == mid * mid) {
                    return true;
                }
            }
        }

        return false;
    }

    public int solution(int[][] board) {
        int row = board.length;
        int col = board[0].length;

        int[][] prefixSum = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                prefixSum[i][j] = board[i - 1][j - 1] + prefixSum[i][j - 1] + prefixSum[i - 1][j] - prefixSum[i - 1][j - 1];
            }
        }

        int length = Math.max(row, col);

        int left = 0;
        int right = length + 1;
        while (left + 1 < right) {
            int mid = (left + right) >> 1;
            if (check(mid, prefixSum)) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return left * left;
    }
}