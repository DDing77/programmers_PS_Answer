package level1.p138477;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name: 명예의 전당 (1)
 * Level : 1
 * Language : Java
 * Category : PriorityQueue
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */

class Solution {

    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            if(pq.size() < k) {
                pq.add(score[i]);
            } else {
                pq.add(score[i]);
                pq.poll();
            }
            answer.add(pq.peek());
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }
}