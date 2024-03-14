package level3.p92343;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : DDing77
 * Problem Name: 양과 늑대
 * Level : 3
 * Language : Java
 * Category : 3
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/92343
 */

class Solution {


    List<Integer>[] edgeList;
    int res;

    private void execDFS(int curNode, List<Integer> nextNode, int sheepCount, int wolfCount, int[] info) {
        res = Math.max(res, sheepCount);

        List<Integer> newNextNodeList = new ArrayList<>(nextNode);

        newNextNodeList.remove(Integer.valueOf(curNode));
        newNextNodeList.addAll(edgeList[curNode]);

        for (int next : newNextNodeList) {
            if (info[next] == 0) {
                execDFS(next, newNextNodeList, sheepCount + 1, wolfCount, info);
            } else {
                if (wolfCount + 1 < sheepCount) {
                    execDFS(next, newNextNodeList, sheepCount, wolfCount + 1, info);
                }
            }
        }
    }

    public int solution(int[] info, int[][] edges) {

        res = 0;

        edgeList = new ArrayList[info.length];
        for (int i = 0; i < edgeList.length; i++) {
            edgeList[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            edgeList[edge[0]].add(edge[1]);
        }

        List<Integer> nextNodeList = new ArrayList<>();
        nextNodeList.add(0);
        execDFS(0, nextNodeList, 1, 0, info);

        return res;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0}, new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}, {3, 7}, {4, 8}, {6, 9}, {9, 10}}));
    }
}