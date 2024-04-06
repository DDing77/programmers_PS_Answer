package level2.p42584;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 주식가격
 * Level : 2
 * Language : Java
 * Category : Stack
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42584
 */

class Solution {

    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            if (stack.isEmpty()) {
                stack.add(new int[]{prices[i], i});
                continue;
            }

            while (!stack.isEmpty() && stack.peek()[0] > prices[i]) {
                int[] pop = stack.pop();
                answer[pop[1]] = i - pop[1];
            }

            stack.add(new int[]{prices[i], i});
        }

        while (!stack.isEmpty()) {
            int[] pop = stack.pop();
            answer[pop[1]] = prices.length - pop[1] - 1;
        }

        return answer;
    }
}
