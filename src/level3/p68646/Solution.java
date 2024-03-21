package level3.p68646;

import java.util.stream.IntStream;

/**
 * Author : DDing77
 * Problem Name : 풍선 터트리기
 * Level : 3
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/68646
 */

class Solution {

    public int solution(int[] a) {

        int answer = 0;
        int length = a.length;
        int[] leftMin = new int[length];
        leftMin[0] = a[0];
        for (int i = 1; i < length; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], a[i]);
        }

        int[] rightMin = new int[length];
        rightMin[length - 1] = a[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], a[i]);
        }

        for (int i = 0; i < length; i++) {
            if (leftMin[i] < a[i] && a[i] > rightMin[i]) {
                answer++;
            }
        }

        return (int) IntStream.range(0, length).filter(i -> a[i] == leftMin[i] || a[i] == rightMin[i]).count();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{9, -1, -5}));
    }
}