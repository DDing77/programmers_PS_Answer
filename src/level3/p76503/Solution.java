package level3.p76503;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Author : DDing77
 * Problem Name : 모두 0으로 만들기
 * Level : 3
 * Language : Java
 * Category : DFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/76503
 */

class Solution {

    public static ArrayList<Integer>[] adj;
    public static long answer;
    public static boolean[] isVisited;
    public static long[] temp;

    public long execDFS(int parent, int cur) {
        isVisited[cur] = true;

        long count = 0L;
        for (int i = 0; i < adj[cur].size(); i++) {
            int next = adj[cur].get(i);
            if (!isVisited[next]) {
                count += execDFS(cur, next);
            }
        }

        if (parent != -1) {
            temp[parent] += temp[cur];
            count += Math.abs(temp[cur]);
            temp[cur] = 0L;
        }

        return count;
    }

    public long solution(int[] a, int[][] edges) {
        adj = IntStream.rangeClosed(0, a.length)
                .mapToObj(i -> new ArrayList<>())
                .toArray(ArrayList[]::new);

        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        temp = new long[a.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[i];
        }

        isVisited = new boolean[a.length];
        answer = execDFS(-1, 0);

        if (temp[0] != 0L) {
            return -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{-5, 0, 2, 1, 2}, new int[][]{{0, 1}, {3, 4}, {2, 3}, {0, 3}}));
    }
}
