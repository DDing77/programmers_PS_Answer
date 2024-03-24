package level3.p152995;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : 인사고과
 * Level : 3
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/152995
 */

class Solution {

    public int solution(int[][] scores) {

        int[] wanho = scores[0];
        Arrays.sort(scores,
                (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(b[0], a[0]));

        int answer = 1;
        int max = 0;

        for (int[] score : scores) {
            if (score[1] < max) {
                if (score.equals(wanho))
                    return -1;
            } else {
                max = score[1];
                if (wanho[0] + wanho[1] < score[0] + score[1])
                    answer++;
            }
        }

        return answer;
    }
}