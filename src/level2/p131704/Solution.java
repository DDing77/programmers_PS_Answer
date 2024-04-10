package level2.p131704;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 택배상자
 * Level : 2
 * Language : Java
 * Category : Stack
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/131704
 */

class Solution {

    public int solution(int[] order) {

        int answer = 0;

        Queue<Integer> que = new ArrayDeque<>();
        for (int box : order) {
            que.add(box);
        }

        Stack<Integer> sub = new Stack<>();
        int number = 1;
        for (int cur : order) {
            if (!sub.isEmpty() && sub.peek() == cur) {
                sub.pop();
                answer++;
                continue;
            }

            if (number > cur) {
                break;
            }

            while (number < cur) {
                sub.add(number++);
            }

            number++;
            answer++;
        }

        return answer;
    }
}
