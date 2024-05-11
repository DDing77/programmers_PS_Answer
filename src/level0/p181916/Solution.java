package level0.p181916;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 주사위 게임 3
 * Level : 0
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181916
 */

class Solution {

    public int solution(int a, int b, int c, int d) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        int answer = 0;
        if (map.size() == 1) {
            answer = 1111 * a;
        } else if (map.size() == 4) {
            int min = Integer.MAX_VALUE;
            for (int key : map.keySet()) {
                min = Math.min(min, key);
            }
            answer = min;
        } else if (map.size() == 2) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int key : map.keySet()) {
                list.add(key);
            }
            int number1 = list.get(0);
            int number1Count = map.get(number1);
            int number2 = list.get(1);
            int number2Count = map.get(number2);

            if (number1Count == number2Count) {
                answer = (number1 + number2) * Math.abs(number1 - number2);
            } else if (number1Count > number2Count) {
                answer = (10 * number1 + number2) * (10 * number1 + number2);
            } else {
                answer = (10 * number2 + number1) * (10 * number2 + number1);
            }
        } else if (map.size() == 3) {
            ArrayList<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    list.add(entry.getKey());
                }
            }
            answer = list.get(0) * list.get(1);
        }
        return answer;
    }
}