package level3.p133500;

import java.util.ArrayList;

/**
 * Author : DDing77
 * Problem Name : 등대
 * Level : 3
 * Language : Java
 * Category : Tree-DP
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/133500
 */

class Solution {

    public ArrayList<Integer>[] edges;
    public int[][] treeDp;
    public boolean[] isVisited;

    private void execDFS(int parent) {
        isVisited[parent] = true;

        for (int child : edges[parent]) {
            if (isVisited[child]) {
                continue;
            }
            execDFS(child);
            if (treeDp[child][0] > 0) {
                treeDp[parent][0] += Math.min(treeDp[child][0], treeDp[child][1]);
                treeDp[parent][1] += treeDp[child][0];
            }
        }
        treeDp[parent][0]++;
    }

    public int solution(int n, int[][] lighthouse) {
        edges = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int[] edge : lighthouse) {
            edges[edge[0]].add(edge[1]);
            edges[edge[1]].add(edge[0]);
        }

        treeDp = new int[n + 1][2];
        isVisited = new boolean[n + 1];
        execDFS(1);
        return Math.min(treeDp[1][0], treeDp[1][1]);
    }
}