package level2.p12909;

import java.util.Stack;

/**
 * Author : DDing77
 * Problem Name: 올바른 괄호
 * Level : 2
 * Language : Java
 * Category : Stack
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */

class Solution {

    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        return stack.isEmpty();
    }
}
