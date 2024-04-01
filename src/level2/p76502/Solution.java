package level2.p76502;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 괄호 회전하기
 * Level : 2
 * Language : Java
 * Category : Stack
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/76502
 */

class Solution {

    public int solution(String s) {

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            boolean check = true;

            for (int j = 0; j < str.length(); j++) {
                char cur = str.charAt(j);
                if (cur == '[' || cur == '(' || cur == '{') {
                    stack.push(cur);
                } else {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    }

                    char last = stack.pop();
                    if (cur == ']' && last != '[') {
                        check = false;
                        break;
                    } else if (cur == ')' && last != '(') {
                        check = false;
                        break;
                    } else if (cur == '}' && last != '{') {
                        check = false;
                        break;
                    }
                }
            }
            if (stack.isEmpty() && check) {
                answer++;
            }
        }
        return answer;
    }
}