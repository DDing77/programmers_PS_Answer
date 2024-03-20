package level3.p72413;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Author : DDing77
 * Problem Name : 합승 택시 요금
 * Level : 3
 * Language : Java
 * Category : Dijkstra
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/72413
 */

class Solution {

    ArrayList<Edge>[] edges;

    public void dijkstra(int[] distanceArray, int start) {
        Arrays.fill(distanceArray, Integer.MAX_VALUE);
        PriorityQueue<Info> pq = new PriorityQueue();
        distanceArray[start] = 0;
        pq.add(new Info(start, 0));

        while (!pq.isEmpty()) {
            Info cur = pq.poll();
            if (distanceArray[cur.idx] < cur.distance) {
                continue;
            }
            for (Edge edge : edges[cur.idx]) {
                if (distanceArray[cur.idx] + edge.weight >= distanceArray[edge.to]) {
                    continue;
                }
                distanceArray[edge.to] = distanceArray[cur.idx] + edge.weight;
                pq.add(new Info(edge.to, distanceArray[edge.to]));
            }
        }
    }

    public int solution(int n, int s, int a, int b, int[][] fares) {

        edges = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int[] fare : fares) {
            edges[fare[0]].add(new Edge(fare[1], fare[2]));
            edges[fare[1]].add(new Edge(fare[0], fare[2]));
        }

        int[] aDistance = new int[n + 1];
        int[] bDistance = new int[n + 1];
        int[] sDistance = new int[n + 1];

        dijkstra(aDistance, a);
        dijkstra(bDistance, b);
        dijkstra(sDistance, s);

        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            answer = Math.min(answer, sDistance[i] + aDistance[i] + bDistance[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(6, 4, 6, 2, new int[][]{{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}}));
    }

    static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Info implements Comparable<Info> {
        int idx;
        int distance;

        public Info(int idx, int distance) {
            this.idx = idx;
            this.distance = distance;
        }

        @Override
        public int compareTo(Info o) {
            return Integer.compare(this.distance, o.distance);
        }
    }
}