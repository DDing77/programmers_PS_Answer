package level2.p138476;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 귤 고르기
 * Level : 2
 * Language : Java
 * Category : Hash
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/138476
 */

class Solution {

    public int solution(int k, int[] tangerine) {


        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (int number : tangerine) {
            numberMap.put(number, numberMap.getOrDefault(number, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(numberMap.keySet());
        list.sort((o1, o2) -> Integer.compare(numberMap.get(o2), numberMap.get(o1)));

        int answer = 0;
        for (int number : list) {
            answer++;
            k -= numberMap.get(number);

            if (k <= 0) {
                break;
            }
        }

        return answer;
    }
}