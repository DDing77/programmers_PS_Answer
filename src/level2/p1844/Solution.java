package level2.p1844;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author : DDing77
 * Problem Name : 게임 맵 최단거리
 * Level : 2
 * Language : Java
 * Category : DFS, BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */

class Solution {

    public int solution(int[][] maps) {

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int row = maps.length;
        int col = maps[0].length;

        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{0, 0, 1});
        boolean[][] isVisited = new boolean[row][col];
        isVisited[0][0] = true;

        while (!que.isEmpty()) {
            int[] cur = que.poll();

            if (cur[0] == row - 1 && cur[1] == col  - 1) {
                return cur[2];
            }

            for (int i = 0; i < dir.length; i++) {
                int nX = cur[0] + dir[i][0];
                int nY = cur[1] + dir[i][1];

                if (nX < 0 || nX >= row || nY < 0 || nY >= col) {
                    continue;
                }
                if (maps[nX][nY] == 0) {
                    continue;
                }
                if (isVisited[nX][nY]) {
                    continue;
                }

                isVisited[nX][nY] = true;
                que.add(new int[]{nX, nY, cur[2] + 1});
            }
        }
        return -1;
    }
}