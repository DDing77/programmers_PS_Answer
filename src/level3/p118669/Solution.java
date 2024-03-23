package level3.p118669;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 등산코스 정하기
 * Level : 3
 * Language : Java
 * Category : Dijkstra
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/118669
 */

class Solution {

    int[] minNodeValue;
    ArrayList<Edge>[] edges;
    HashSet<Integer> peek;
    HashSet<Integer> entrance;

    private void execBFS(int gate) {

        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{gate, 0});

        while (!que.isEmpty()) {
            int[] cur = que.poll();

            if (peek.contains(cur[0])) {
                continue;
            }

            for (Edge edge : edges[cur[0]]) {
                if (!entrance.contains(edge.to)) {
                    int nextValue = Math.max(cur[1], edge.weight);

                    if (nextValue < minNodeValue[edge.to]) {
                        minNodeValue[edge.to] = nextValue;
                        que.add(new int[]{edge.to, nextValue});
                    }
                }
            }
        }
    }

    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {

        edges = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }

        peek = new HashSet<>();
        for (int summit : summits) {
            peek.add(summit);
        }

        entrance = new HashSet<>();
        for (int gate : gates) {
            entrance.add(gate);
        }

        minNodeValue = new int[n + 1];
        Arrays.fill(minNodeValue, Integer.MAX_VALUE);

        for (int i = 0; i < paths.length; i++) {
            int from = paths[i][0];
            int to = paths[i][1];
            int weight = paths[i][2];

            edges[from].add(new Edge(to, weight));
            edges[to].add(new Edge(from, weight));

        }

        for (int gate : gates) {
            execBFS(gate);
        }

        int minWeight = Integer.MAX_VALUE;
        int minSummit = -1;

        for (int summit : summits) {
            if (minWeight > minNodeValue[summit]) {
                minWeight = minNodeValue[summit];
                minSummit = summit;
            } else if (minWeight == minNodeValue[summit]) {
                minSummit = Math.min(minSummit, summit);
            }
        }

        return new int[]{minSummit, minWeight};
    }

    static class Edge {

        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}