package level2.p87694;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 아이템 줍기
 * Level : 3
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/87694
 */

class Solution {

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;

        int[][] board = new int[101][101];
        for (int[] rec : rectangle) {
            for (int i = 0; i < 4; i++) {
                rec[i] *= 2;
            }

            for (int i = rec[0]; i <= rec[2]; i++) {
                for (int j = rec[1]; j <= rec[3]; j++) {
                    if (board[i][j] == 2) {
                        continue;
                    }
                    if (i == rec[0] || i == rec[2] || j == rec[1] || j == rec[3]) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 2;
                    }
                }
            }
        }

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] isVisited = new boolean[101][101];
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{characterX * 2, characterY * 2, 0});
        isVisited[characterX * 2][characterY * 2] = true;

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            if (cur[0] == itemX * 2 && cur[1] == itemY * 2) {
                return cur[2] / 2;
            }

            for (int i = 0; i < dir.length; i++) {
                int nX = cur[0] + dir[i][0];
                int nY = cur[1] + dir[i][1];

                if (nX < 0 || nX >= 101 || nY < 0 || nY >= 101) {
                    continue;
                }
                if (isVisited[nX][nY]) {
                    continue;
                }
                if (board[nX][nY] != 1) {
                    continue;
                }

                que.add(new int[]{nX, nY, cur[2] + 1});
                isVisited[nX][nY] = true;
            }
        }
        return answer;
    }
}