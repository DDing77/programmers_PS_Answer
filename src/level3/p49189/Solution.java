package level3.p49189;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Author : DDing77
 * Problem Name: 가장 먼 노드
 * Level : 3
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/49189
 */

class Solution {

    public int solution(int n, int[][] edge) {

        ArrayList<Integer>[] edgeList = new ArrayList[n + 1];
        for (int i = 0; i < edgeList.length; i++) {
            edgeList[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge.length; i++) {
            edgeList[edge[i][0]].add(edge[i][1]);
            edgeList[edge[i][1]].add(edge[i][0]);
        }

        Queue<int[]> que = new ArrayDeque<>();
        boolean[] isVisited = new boolean[n + 1];
        que.add(new int[]{1, 0});
        isVisited[1] = true;

        int maxDepth = -1;
        int count = 0;
        while (!que.isEmpty()) {
            int[] cur = que.poll();

            if (cur[1] > maxDepth) {
                maxDepth = cur[1];
                count = 1;
            } else if (cur[1] == maxDepth) {
                count++;
            }

            for (int next : edgeList[cur[0]]) {
                if (isVisited[next]) {
                    continue;
                }

                isVisited[next] = true;
                que.add(new int[]{next, cur[1] + 1});
            }
        }

        return count;
    }
}