package level3.p12938;

/**
 * Author : DDing77
 * Problem Name: 최고의 집합
 * Level : 3
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12938
 */

class Solution {

    public int[] solution(int n, int s) {

        if (s < n) {
            return new int[]{-1};
        }

        int[] answer = new int[n];

        int q = s / n;
        int r = s % n;

        for (int i = 0; i < n; i++) {
            answer[i] = q;
        }

        int idx = n - 1;
        while (r-- > 0) {
            answer[idx--]++;
        }

        return answer;
    }
}