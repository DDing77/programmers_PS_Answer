package level0.p120866;

/**
 * Author : DDing77
 * Problem Name : 안전지대
 * Level : 0
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120866
 */

class Solution {

    private int[][] dir = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public int solution(int[][] board) {
        int length = board.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == 1) {
                    count++;
                    for (int k = 0; k < dir.length; k++) {
                        int nX = i + dir[k][0];
                        int nY = j + dir[k][1];

                        if (nX < 0 || nX >= length || nY < 0 || nY >= length) {
                            continue;
                        }
                        if (board[nX][nY] == 1) {
                            continue;
                        }
                        if (board[nX][nY] == 0) {
                            count++;
                        }
                        board[nX][nY] = 2;
                    }
                }
            }
        }

        return length * length - count;
    }
}
