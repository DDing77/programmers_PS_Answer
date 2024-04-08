package level2.p12946;

/**
 * Author : DDing77
 * Problem Name : 하노이의 탑
 * Level : 2
 * Language : Java
 * Category : Divide-And-conquer
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12946
 */

class Solution {

    public int[][] answer;
    public int count;

    public void execHanoi(int n, int from, int to, int via) {

        if (n == 1) {
            answer[count++] = new int[]{from, to};
            return;
        }

        execHanoi(n - 1, from, via, to);
        answer[count++] = new int[]{from, to};
        execHanoi(n - 1, via, to, from);
    }

    public int[][] solution(int n) {

        answer = new int[(int) Math.pow(2, n) - 1][2];
        count = 0;

        execHanoi(n, 1, 3, 2);

        return answer;
    }
}