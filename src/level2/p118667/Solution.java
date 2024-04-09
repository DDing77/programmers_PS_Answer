package level2.p118667;

/**
 * Author : DDing77
 * Problem Name : 두 큐 합 같게 만들기
 * Level : 2
 * Language : Java
 * Category : Two-Pointer, Queue
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/118667
 */

class Solution {

    public int solution(int[] queue1, int[] queue2) {

        int[] totalQueue = new int[queue1.length + queue2.length];

        long totalSum = 0L;
        for (int i = 0; i < queue1.length; i++) {
            totalQueue[i] = queue1[i];
            totalSum += queue1[i];
        }

        for (int i = 0; i < queue2.length; i++) {
            totalQueue[i + queue1.length] = queue2[i];
            totalSum += queue2[i];
        }

        if (totalSum % 2 != 0) {
            return -1;
        }

        int left = 0;
        int right = 0;
        int length = totalQueue.length;
        long sum = 0L;
        int answer = Integer.MAX_VALUE;
        while (right < length) {
            if (sum + totalQueue[right] <= totalSum / 2) {
                sum += totalQueue[right];
                right++;
            } else {
                sum -= totalQueue[left];
                left++;
            }

            if (sum == totalSum / 2) {
                if (right < queue1.length) {
                    answer = Math.min(answer, right + queue2.length);
                } else {
                    answer = Math.min(answer, left + right - queue1.length);
                }
            }
        }

        if (answer == Integer.MAX_VALUE) {
            return -1;
        } else {
            return answer;
        }
    }
}