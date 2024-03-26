package level1.p160586;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 대충 만든 자판
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/160586
 */

class Solution {

    public int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                map.put(key.charAt(i), Math.min(map.getOrDefault(key.charAt(i), i + 1), i + 1));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            String target = targets[i];
            for (int j = 0; j < target.length(); j++) {
                if (!map.containsKey(target.charAt(j))) {
                    count = -1;
                    break;
                }
                count += map.get(target.charAt(j));
            }

            answer[i] = count;
        }

        return answer;
    }
}