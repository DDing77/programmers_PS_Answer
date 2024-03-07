package level3.p12927;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Author : DDing77
 * Problem Name: 야근 지수
 * Level : 3
 * Language : Java
 * Category : Sort, PriorityQueue
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12927
 */

class Solution {

    public long solution(int n, int[] works) {

        int total = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int work : works) {
            total += work;
            pq.add(work);
        }

        if (total <= n) {
            return 0L;
        }

        while (n-- > 0) {
            int target = pq.poll() - 1;
            if (target == 0) {
                continue;
            }
            pq.add(target);
        }

        return pq.stream().mapToLong(value -> (long) Math.pow(value, 2)).sum();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(3, new int[]{1, 1}));
    }
}
