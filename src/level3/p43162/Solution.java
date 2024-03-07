package level3.p43162;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author : DDing77
 * Problem Name: 네트워크
 * Level : 3
 * Language : Java
 * Category : DFS, BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/43162
 */

class Solution {

    public void execBFS(int node, int[][] computers, boolean[] isVisited) {
        isVisited[node] = true;
        Queue<Integer> que = new ArrayDeque<>();
        que.add(node);

        while (!que.isEmpty()) {
            int cur = que.poll();

            for (int i = 0; i < isVisited.length; i++) {
                if (cur == i) {
                    continue;
                }

                if (computers[cur][i] == 1) {
                    if (isVisited[i]) {
                        continue;
                    }

                    isVisited[i] = true;
                    que.add(i);
                }
            }
        }
    }

    public int solution(int n, int[][] computers) {

        int answer = 0;

        boolean[] isVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (isVisited[i]) {
                continue;
            }
            answer++;
            execBFS(i, computers, isVisited);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
    }
}