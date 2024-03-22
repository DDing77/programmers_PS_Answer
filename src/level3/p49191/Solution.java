package level3.p49191;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 순위
 * Level : 3
 * Language : Java
 * Category : BFS, Floyd-warshall
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/49191
 */

class Solution {

    public int solution(int n, int[][] results) {

        int answer = 0;
        Map<Integer, List<Integer>> winGraph = new HashMap<>();
        Map<Integer, List<Integer>> loseGraph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            winGraph.put(i, new ArrayList<>());
            loseGraph.put(i, new ArrayList<>());
        }
        for (int[] result : results) {
            int winner = result[0];
            int loser = result[1];
            winGraph.get(winner).add(loser);
            loseGraph.get(loser).add(winner);
        }

        for (int i = 1; i <= n; i++) {
            boolean[] visited = new boolean[n + 1];
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            visited[i] = true;
            int win = 0, lose = 0;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : winGraph.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                        win++;
                    }
                }
            }

            Arrays.fill(visited, false);
            queue.offer(i);
            visited[i] = true;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : loseGraph.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                        lose++;
                    }
                }
            }

            if (win + lose == n - 1) {
                answer++;
            }
        }

        return answer;
    }
}