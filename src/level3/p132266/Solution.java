package level3.p132266;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

/**
 * Author : DDing77
 * Problem Name : 부대복귀
 * Level : 3
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/132266
 */

class Solution {

    //    int[] parent;
    ArrayList<Integer>[] edges;
    int[] distance;

//    public int find(int x) {
//
//        if (parent[x] < 0) {
//            return x;
//        }
//        return parent[x] = find(parent[x]);
//    }
//
//    public void union(int x, int y) {
//
//        int a = find(x);
//        int b = find(y);
//
//        if (parent[a] < parent[b]) {
//            parent[a] += parent[b];
//            parent[b] = a;
//        } else {
//            parent[b] += parent[a];
//            parent[a] = b;
//        }
//    }

    public void findMinDistance(int n, int destination) {

        Queue<Integer> que = new ArrayDeque<>();
        boolean[] isVisited = new boolean[n + 1];
        distance = new int[n + 1];

        Arrays.fill(distance, -1);
        distance[destination] = 0;

        que.add(destination);
        isVisited[destination] = true;

        while (!que.isEmpty()) {
            int cur = que.poll();

            for (int next : edges[cur]) {
                if (isVisited[next]) {
                    continue;
                }

                que.add(next);
                isVisited[next] = true;
                distance[next] = distance[cur] + 1;
            }
        }

    }

    public int[] solution(int n, int[][] roads, int[] sources, int destination) {

//        parent = new int[n + 1];
//        Arrays.fill(parent, -1);

        edges = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < roads.length; i++) {
            int from = roads[i][0];
            int to = roads[i][1];

//            if (find(from) != find(to)) {
//                union(from, to);
//            }

            edges[from].add(to);
            edges[to].add(from);
        }


        int[] answer = new int[sources.length];
        findMinDistance(n, destination);

        for (int i = 0; i < sources.length; i++) {
//            if (find(sources[i]) != find(destination)) {
//                answer[i] = -1;
//                continue;
//            }

            answer[i] = distance[sources[i]];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(5, new int[][]{{1, 2}, {1, 4}, {2, 4}, {2, 5}, {4, 5}}, new int[]{1, 3, 5}, 5)));
    }
}