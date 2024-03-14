package level3.p67259;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author : DDing77
 * Problem Name: 경주로 건설
 * Level : 3
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/67259
 */

class Solution {

    final int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    boolean[][][] isVisited;
    int length;
    int res;

    private boolean isRange(int x, int y, int length, int[][] board) {
        if (x < 0 || x >= length || y < 0 || y >= length) {
            return false;
        }
        return board[x][y] != 1;
    }

    private void execDFS(int[][] board) {

        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{-1, 0, 0, 0});
        for (int i = 0; i < 4; i++) {
            isVisited[0][0][i] = true;
        }

        while (!que.isEmpty()) {
            int[] cur = que.poll();

            if (cur[1] == length - 1 && cur[2] == length - 1) {
                res = Math.min(res, cur[3]);
                continue;
            }

            for (int i = 0; i < dir.length; i++) {
                int nX = cur[1] + dir[i][0];
                int nY = cur[2] + dir[i][1];

                if (!isRange(nX, nY, length, board)) {
                    continue;
                }

                int nextCost = cur[3];
                if (cur[0] == -1 || cur[0] == i) {
                    nextCost += 100;
                } else {
                    nextCost += 600;
                }

                //0 0 0
                //0 0 1
                //0 0 0
                if (!isVisited[nX][nY][i] || board[nX][nY] >= nextCost) {
                    isVisited[nX][nY][i] = true;
                    board[nX][nY] = nextCost;
                    que.add(new int[]{i, nX, nY, nextCost});
                }
            }
        }
    }

    public int solution(int[][] board) {

        length = board.length;
        res = Integer.MAX_VALUE;
        isVisited = new boolean[length][length][4];

        execDFS(board);

        return res;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0}}));
    }
}