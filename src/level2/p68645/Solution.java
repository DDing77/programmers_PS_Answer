package level2.p68645;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 삼각 달팽이
 * Level : 2
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/68645
 */

class Solution {

    public int[] solution(int n) {

        int[][] map = new int[n][n];
        int[][] dir = {{1, 0}, {0, 1}, {-1, -1}};

        int cur = 1;
        int dirIdx = 0;
        int x = 0;
        int y = 0;
        int size = n * (n + 1) / 2;
        while (true) {
            map[x][y] = cur++;

            if (cur > size) {
                break;
            }

            int nX = x + dir[dirIdx][0];
            int nY = y + dir[dirIdx][1];

            if (nX < 0 || nX >= n || nY < 0 || nY >= n || map[nX][nY] != 0) {
                dirIdx = (dirIdx + 1) % dir.length;
            }

            x = x + dir[dirIdx][0];
            y = y + dir[dirIdx][1];
        }

        int idx = 0;
        int[] answer = new int[size];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0) {
                    answer[idx++] = map[i][j];
                } else {
                    break;
                }
            }
        }
        return answer;
    }
}