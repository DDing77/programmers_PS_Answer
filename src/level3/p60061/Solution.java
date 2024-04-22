package level3.p60061;

/**
 * Author : DDing77
 * Problem Name : 기둥과 보 설치
 * Level : 3
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/60061
 */

class Solution {

    public int installedCount;
    public boolean[][][] board;

    private boolean deletable(int n, int x, int y, int type) {
        if (type == 0) {
            if (y < n - 1 && board[x][y + 1][0] && !installable(n, x, y + 1, 0)) {
                return false;
            } else if (x > 0 && board[x - 1][y + 1][1] && !installable(n, x - 1, y + 1, 1)) {
                return false;
            } else if (x < n && board[x][y + 1][1] && !installable(n, x, y + 1, 1)) {
                return false;
            }
        } else {
            if (y < n && board[x][y][0] && !installable(n, x, y, 0)) {
                return false;
            } else if (y < n && board[x + 1][y][0] && !installable(n, x + 1, y, 0)) {
                return false;
            } else if (x > 0 && board[x - 1][y][1] && !installable(n, x - 1, y, 1)) {
                return false;
            } else if (x < n - 1 && board[x + 1][y][1] && !installable(n, x + 1, y, 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean installable(int n, int x, int y, int type) {
        if (type == 0) {
            if (y == 0) {
                return true;
            } else if (y > 0 && board[x][y - 1][0]) {
                return true;
            } else if ((x > 0 && board[x - 1][y][1]) || (x < n && board[x][y][1])) {
                return true;
            }
        } else {
            if (y > 0 && board[x][y - 1][0]) {
                return true;
            } else if (y > 0 && x < n && board[x + 1][y - 1][0]) {
                return true;
            } else if (y > 0 && x > 0 && board[x - 1][y][1] && x < n - 1 && board[x + 1][y][1]) {
                return true;
            }
        }
        return false;
    }

    public int[][] solution(int n, int[][] build_frame) {
        installedCount = 0;
        board = new boolean[101][101][2];

        for (int i = 0; i < build_frame.length; i++) {
            int x = build_frame[i][0];
            int y = build_frame[i][1];
            int type = build_frame[i][2];
            int op = build_frame[i][3];

            if (op == 0) {
                board[x][y][type] = false;
                if (deletable(n, x, y, type)) {
                    installedCount--;
                } else {
                    board[x][y][type] = true;
                }
            } else {
                if (installable(n, x, y, type)) {
                    board[x][y][type] = true;
                    installedCount++;
                }
            }
        }

        int idx = 0;
        int[][] answer = new int[installedCount][3];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k < board[i][j].length; k++) {
                    if (board[i][j][k]) {
                        answer[idx][0] = i;
                        answer[idx][1] = j;
                        answer[idx][2] = k;
                        idx++;
                    }
                }
            }
        }
        return answer;
    }
}