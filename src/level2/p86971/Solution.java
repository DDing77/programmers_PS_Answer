package level2.p86971;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : 전력망을 둘로 나누기
 * Level : 2
 * Language : Java
 * Category : Disjoint-Set
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/86971
 */

class Solution {


    private int[] parents;

    public int find(int x) {
        if (parents[x] < 0) {
            return x;
        }
        return parents[x] = find(parents[x]);
    }

    public void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) {
            return;
        }

        if (parents[x] < parents[y]) {
            parents[x] += parents[y];
            parents[y] = x;
        } else {
            parents[y] += parents[x];
            parents[x] = y;
        }
    }

    public int solution(int n, int[][] wires) {

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {

            parents = new int[n + 1];
            Arrays.fill(parents, -1);
            for (int j = 0; j < wires.length; j++) {
                if (i == j) {
                    continue;
                }

                union(wires[j][0], wires[j][1]);
            }

            ArrayList<Integer> groups = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                if (parents[j] < 0) {
                    groups.add(-parents[j]);
                }
            }
            answer = Math.min(answer, Math.abs(groups.get(0) - groups.get(1)));
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}));
    }
}