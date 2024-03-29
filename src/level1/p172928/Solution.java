package level1.p172928;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : DDing77
 * Problem Name : 공원 산책
 * Level : 1
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/172928
 */

class Solution {

    Map<Character, int[]> dirMap;

    public boolean check(String[] park, int row, int col, int x, int y, int[] dir, int distance) {

        for (int i = 0; i < distance; i++) {
            x += dir[0];
            y += dir[1];

            if (x < 0 || x >= row || y < 0 || y >= col) {
                return false;
            }

            if (park[x].charAt(y) == 'X') {
                return false;
            }
        }

        return true;
    }

    public int[] solution(String[] park, String[] routes) {

        int row = park.length;
        int col = park[0].length();

        int curX = -1;
        int curY = -1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (park[i].charAt(j) == 'S') {
                    curX = i;
                    curY = j;
                }
            }
        }

        dirMap = new HashMap<>();
        dirMap.put('N', new int[]{-1, 0});
        dirMap.put('S', new int[]{1, 0});
        dirMap.put('W', new int[]{0, -1});
        dirMap.put('E', new int[]{0, 1});

        for (int i = 0; i < routes.length; i++) {
            char dirChar = routes[i].charAt(0);
            int distance = routes[i].charAt(2) - '0';
            int[] dir = dirMap.get(dirChar);
            if (check(park, row, col, curX, curY, dir, distance)) {
                curX = curX + dir[0] * distance;
                curY = curY + dir[1] * distance;
            }
        }

        return new int[]{curX, curY};
    }
}