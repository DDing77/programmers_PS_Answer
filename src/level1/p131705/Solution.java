package level1.p131705;

/**
 * Author : DDing77
 * Problem Name: 삼총사
 * Level : 1
 * Language : Java
 * Category : BruteForce, DFS
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */

class Solution {

    static int res;
    static boolean[] isVisited;

    public void backTracking(int[] number, int depth, int idx, int sum) {
        if (depth == 3) {
            if (sum == 0) {
                res++;
            }
            return;
        }

        for (int i = idx; i < number.length; i++) {
            backTracking(number, depth + 1, i + 1, sum + number[i]);
        }

    }

    public int solution(int[] number) {
        res = 0;
        isVisited = new boolean[number.length];

        backTracking(number, 0, 0, 0);

        return res;
    }
}
