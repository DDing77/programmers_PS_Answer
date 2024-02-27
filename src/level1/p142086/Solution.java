package level1.p142086;

import java.util.HashMap;

/**
 * Author : DDing77
 * Problem Name: 가장 가까운 같은 글자
 * Level : 1
 * Language : Java
 * Category : Hash
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */

class Solution {

    static HashMap<Character, Integer> alpha;

    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];

        alpha = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char cur = s.charAt(i);
            if (!alpha.containsKey(cur)) {
                answer[i] = -1;
            } else {
                answer[i] = i - alpha.get(cur);
            }
            alpha.put(cur, i);
        }

        return answer;
    }
}