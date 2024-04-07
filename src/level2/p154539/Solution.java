package level2.p154539;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 뒤에 있는 큰 수 찾기
 * Level : 2
 * Language : Java
 * Category : Stack
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/154539
 */

class Solution {

    public int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];

            while (!stack.isEmpty() && stack.peek()[0] < cur) {
                int[] pre = stack.pop();
                answer[pre[1]] = cur;
            }

            stack.add(new int[]{cur, i});
        }

        while (!stack.isEmpty()) {
            int[] pre = stack.pop();
            answer[pre[1]] = -1;
        }

        return answer;
    }
}
