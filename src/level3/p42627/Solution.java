package level3.p42627;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Author : DDing77
 * Problem Name: 디스크 컨트롤러
 * Level : 3
 * Language : Java
 * Category : Heap
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42627
 */

class Solution {

    public int solution(int[][] jobs) {

        int answer = 0;

        PriorityQueue<int[]> progressPQ = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

        int idx = 0;
        int time = 0;
        while (idx < jobs.length || !progressPQ.isEmpty()) {

            while (idx < jobs.length && time >= jobs[idx][0]) {
                progressPQ.add(new int[]{jobs[idx][0], jobs[idx][1]});
                idx++;
            }

            if (progressPQ.isEmpty()) {
                time = jobs[idx][0];
                continue;
            }

            int[] doneJob = progressPQ.poll();
            answer += (time - doneJob[0]) + doneJob[1];
            time += doneJob[1];
            System.out.println("answer = " + answer);
        }

        return answer / jobs.length;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }
}