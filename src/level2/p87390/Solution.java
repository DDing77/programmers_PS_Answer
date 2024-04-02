package level2.p87390;

/**
 * Author : DDing77
 * Problem Name : n^2 배열 자르기
 * Level : 2
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/87390
 */

class Solution {

    public int[] solution(int n, long left, long right) {

        int[] answer = new int[(int) (right - left) + 1];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            answer[idx++] = Math.max((int) (i / n), (int) (i % n)) + 1;
        }
        return answer;
    }
}