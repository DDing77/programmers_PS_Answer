package level2.p258711;

/**
 * Author : DDing77
 * Problem Name : 도넛과 막대 그래프
 * Level : 2
 * Language : Java
 * Category : Graph
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/258711
 */

class Solution {

    public int[] solution(int[][] edges) {
        int maxV = 0;
        for (int[] edge : edges) {
            maxV = Math.max(maxV, Math.max(edge[0], edge[1]));
        }

        int[] in = new int[maxV + 1];
        int[] out = new int[maxV + 1];
        for (int[] edge : edges) {
            in[edge[1]]++;
            out[edge[0]]++;
        }

        int deletedV = -1;
        int findCount = 0;
        int type2Count = 0;
        int type3Count = 0;
        for (int i = 1; i <= maxV; i++) {
            if (out[i] >= 2 && in[i] == 0) {
                deletedV = i;
            } else if (in[i] >= 2 && out[i] >= 2) {
                type3Count++;
                findCount++;
            } else if (out[i] == 0 && in[i] >= 1) {
                type2Count++;
                findCount++;
            }
        }

        return new int[]{deletedV, out[deletedV] - findCount, type2Count, type3Count};
    }
}