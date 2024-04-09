package level2.p42583;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 다리를 지나는 트럭
 * Level : 2
 * Language : Java
 * Category : Queue
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42583
 */

class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Deque<int[]> que = new ArrayDeque<>();
        int curWeight = 0;
        int answerTime = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            answerTime++;
            if (!que.isEmpty() && que.peek()[1] + bridge_length == answerTime) {
                curWeight -= que.poll()[0];
            }

            while (!que.isEmpty() && curWeight + truck_weights[i] > weight) {
                int[] preTruck = que.poll();
                answerTime = preTruck[1] + bridge_length;
                curWeight -= preTruck[0];
            }

            que.add(new int[]{truck_weights[i], answerTime});
            curWeight += truck_weights[i];
        }

        answerTime = que.getLast()[1] + bridge_length;
        return answerTime;
    }
}