package level3.p150365;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 미로 탈출 명령어
 * Level : 3
 * Language : Java
 * Category : Greedy, BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/150365
 */

class Solution {

    public static final TreeMap<String, int[]> direction = new TreeMap<>();

    public void initDirection() {
        direction.put("d", new int[]{1, 0});
        direction.put("l", new int[]{0, -1});
        direction.put("r", new int[]{0, 1});
        direction.put("u", new int[]{-1, 0});
    }

    private boolean isRange(int n, int m, int x, int y) {
        return x <= 0 || x > n || y <= 0 || y > m;
    }

    private int getMinDistance(int x, int y, int r, int c) {
        return Math.abs(x - r) + Math.abs(y - c);
    }

    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        initDirection();

        StringBuilder answer = new StringBuilder();

        if (getMinDistance(x, y, r, c) > k || (k - getMinDistance(x, y, r, c)) % 2 == 1) {
            return "impossible";
        }

        while (k > 0 && getMinDistance(x, y, r, c) < k) {
            k--;
            for (Map.Entry<String, int[]> dir : direction.entrySet()) {
                int nX = x + dir.getValue()[0];
                int nY = y + dir.getValue()[1];

                if (isRange(n, m, nX, nY)) {
                    continue;
                }

                answer.append(dir.getKey());
                x = nX;
                y = nY;
                break;
            }
        }

        while (x != r || y != c) {
            k--;
            for (Map.Entry<String, int[]> dir : direction.entrySet()) {
                int nX = x + dir.getValue()[0];
                int nY = y + dir.getValue()[1];

                if (isRange(n, m, nX, nY)) {
                    continue;
                }
                if (getMinDistance(nX, nY, r, c) != k) {
                    continue;
                }

                answer.append(dir.getKey());
                x = nX;
                y = nY;
                break;
            }
        }

        return answer.toString();
    }
}