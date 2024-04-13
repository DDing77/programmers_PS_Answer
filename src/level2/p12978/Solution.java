package level2.p12978;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 배달
 * Level : 2
 * Language : Java
 * Category : Dijkstra
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12978
 */

class Solution {

    int[] distances;
    ArrayList<Node>[] edges;

    public void dijkstra(int start) {

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
        pq.add(new Node(start, 0));
        distances[start] = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (distances[cur.to] < cur.weight) {
                continue;
            }

            for (Node next : edges[cur.to]) {
                if (next.weight + distances[cur.to] < distances[next.to]) {
                    distances[next.to] = next.weight + distances[cur.to];
                    pq.add(new Node(next.to, distances[next.to]));
                }
            }
        }
    }

    public int solution(int N, int[][] road, int K) {

        edges = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < road.length; i++) {
            edges[road[i][0]].add(new Node(road[i][1], road[i][2]));
            edges[road[i][1]].add(new Node(road[i][0], road[i][2]));
        }

        distances = new int[N + 1];
        Arrays.fill(distances, 2_000 * 10_000);
        dijkstra(1);

        int answer = 0;
        for (int distance : distances) {
            if (distance <= K) {
                answer++;
            }
        }
        return answer;
    }

    static class Node {

        int to;
        int weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}