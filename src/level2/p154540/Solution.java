package level2.p154540;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

/**
 * Author : DDing77
 * Problem Name : 무인도 여행
 * Level : 2
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/154540
 */

class Solution {

    public static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private int getArea(int x, int y, int row, int col, boolean[][] isVisited, String[] maps) {
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{x, y});
        isVisited[x][y] = true;

        int count = maps[x].charAt(y) - '0';
        while (!que.isEmpty()) {
            int[] cur = que.poll();

            for (int i = 0; i < dir.length; i++) {
                int nX = cur[0] + dir[i][0];
                int nY = cur[1] + dir[i][1];

                if (nX < 0 || nX >= row || nY < 0 || nY >= col) {
                    continue;
                }

                if (isVisited[nX][nY]) {
                    continue;
                }

                if (maps[nX].charAt(nY) == 'X') {
                    continue;
                }

                count += maps[nX].charAt(nY) - '0';
                que.add(new int[]{nX, nY});
                isVisited[nX][nY] = true;
            }
        }

        return count;
    }

    public int[] solution(String[] maps) {
        int row = maps.length;
        int col = maps[0].length();

        ArrayList<Integer> groups = new ArrayList<>();
        boolean[][] isVisited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (maps[i].charAt(j) != 'X' && !isVisited[i][j]) {
                    groups.add(getArea(i, j, row, col, isVisited, maps));
                }
            }
        }

        if (groups.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(groups);

        return groups.stream().mapToInt(Integer::new).toArray();
    }
}
