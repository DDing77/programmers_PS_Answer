package level2.p159993;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author : DDing77
 * Problem Name : 미로 탈출
 * Level : 2
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/159993
 */

class Solution {

    public int solution(String[] maps) {

        int answer = 0;

        int distanceStart = Integer.MAX_VALUE;
        int distanceExit = Integer.MAX_VALUE;

        int row = maps.length;
        int col = maps[0].length();

        int leverX = -1;
        int leverY = -1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (maps[i].charAt(j) == 'L') {
                    leverX = i;
                    leverY = j;
                }
            }
        }

        boolean[][] isVisited = new boolean[row][col];
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{leverX, leverY, 0});
        isVisited[leverX][leverY] = true;

        while (!que.isEmpty()) {
            int[] cur = que.poll();

            if (maps[cur[0]].charAt(cur[1]) == 'S') {
                distanceStart = cur[2];
            }

            if (maps[cur[0]].charAt(cur[1]) == 'E') {
                distanceExit = cur[2];
            }

            for (int i = 0; i < dir.length; i++) {
                int nX = cur[0] + dir[i][0];
                int nY = cur[1] + dir[i][1];

                if (nX < 0 || nX >= row || nY < 0 || nY >= col) {
                    continue;
                }
                if (isVisited[nX][nY]) {
                    continue;
                }
                if (maps[cur[0]].charAt(cur[1]) == 'X') {
                    continue;
                }

                que.add(new int[]{nX, nY, cur[2] + 1});
                isVisited[nX][nY] = true;
            }
        }

        if (distanceExit == Integer.MAX_VALUE || distanceStart == Integer.MAX_VALUE) {
            return -1;
        }

        return distanceStart + distanceExit;
    }
}