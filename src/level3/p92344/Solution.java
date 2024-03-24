package level3.p92344;

/**
 * Author : DDing77
 * Problem Name : 파괴되지 않은 건물
 * Level : 3
 * Language : Java
 * Category : PrefixSum
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/92344
 */

class Solution {

    public int solution(int[][] board, int[][] skill) {

        int answer = 0;
        int row = board.length;
        int col = board[0].length;

        int[][] preSum = new int[row + 1][col + 1];

        for (int[] skillInfo : skill) {
            int value = skillInfo[5];
            if (skillInfo[0] == 1) {
                value *= -1;
            }

            preSum[skillInfo[1]][skillInfo[2]] += value;
            preSum[skillInfo[1]][skillInfo[4] + 1] -= value;
            preSum[skillInfo[3] + 1][skillInfo[2]] -= value;
            preSum[skillInfo[3] + 1][skillInfo[4] + 1] += value;
        }

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < col; j++) {
                preSum[i][j + 1] += preSum[i][j];
            }
        }

        for (int i = 0; i <= col; i++) {
            for (int j = 0; j < row; j++) {
                preSum[j + 1][i] += preSum[j][i];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] + preSum[i][j] > 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}