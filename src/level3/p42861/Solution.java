package level3.p42861;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 섬 연결하기
 * Level : 3
 * Language : Java
 * Category : Disjoint-set
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42861
 */

class Solution {

    Edge[] edges;
    int[] parent;

    private int find(int x) {
        if (parent[x] < 0) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    private void union(int x, int y) {
        int a = find(x);
        int b = find(y);

        if (a == b) return;

        if (parent[a] < parent[b]) {
            parent[a] += parent[b];
            parent[b] = a;
        } else {
            parent[b] += parent[a];
            parent[a] = b;
        }
    }

    public int solution(int n, int[][] costs) {

        int answer = 0;
        parent = new int[n];
        Arrays.fill(parent, -1);

        edges = new Edge[costs.length];
        for (int i = 0; i < costs.length; i++) {
            edges[i] = new Edge(costs[i][0], costs[i][1], costs[i][2]);
        }

        Arrays.sort(edges, (a , b) -> a.cost - b.cost);

        for (Edge edge : edges) {
            if (find(edge.from) != find(edge.to)) {
                answer += edge.cost;
                union(edge.from, edge.to);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(4, new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}}));
    }

    static class Edge {
        int from;
        int to;
        int cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
}