package level1.p42576;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 완주하지 못한 선수
 * Level : 1
 * Language : Java
 * Category : 1
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */

class Solution {

    public String solution(String[] participant, String[] completion) {

        String answer = "";

        Map<String, Integer> looser = new HashMap<>();

        for (String str : participant) {
            looser.put(str, looser.getOrDefault(str, 0) + 1);
        }

        for (String str : completion) {
            if (looser.get(str) == 1) {
                looser.remove(str);
            } else {
                looser.put(str, looser.get(str) - 1);
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : looser.entrySet()) {
            answer = stringIntegerEntry.getKey();
        }
        return answer;
    }
}