package level2.p154538;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 숫자 변환하기
 * Level : 2
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/154538
 */

class Solution {

    public int solution(int x, int y, int n) {

        Set<Integer> cache = new HashSet<>();
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{x, 0});
        cache.add(x);

        int[] op = {2, 3};

        while (!que.isEmpty()) {
            int[] cur = que.poll();

            if (cur[0] == y) {
                return cur[1];
            }

            int nX = cur[0] + n;
            if (nX <= y && !cache.contains(nX)) {
                que.add(new int[]{nX, cur[1] + 1});
                cache.add(nX);
            }

            for (int i = 0; i < op.length; i++) {
                nX = cur[0] * op[i];
                if (nX <= y && !cache.contains(nX)) {
                    que.add(new int[]{nX, cur[1] + 1});
                    cache.add(nX);
                }
            }
        }
        return -1;
    }
}