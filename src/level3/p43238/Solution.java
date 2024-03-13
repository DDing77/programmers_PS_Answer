package level3.p43238;

import java.util.Arrays;


/**
 * Author : DDing77
 * Problem Name: 입국심사
 * Level : 3
 * Language : Java
 * Category : Binary-Search
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/43238
 */

class Solution {

    public long solution(int n, int[] times) {

        long answer = 0;
        Arrays.sort(times);

        long left = 1;
        long right = (long) n * times[times.length - 1];
        long mid;

        while (left <= right) {
            mid = (left + right) >> 1;

            long sum = 0;
            for (int time : times) {
                sum += mid / time;
            }

            if (sum >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}
