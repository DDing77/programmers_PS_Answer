package level2.p17680;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : [1차] 캐시
 * Level : 2
 * Language : Java
 * Category : Hash
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/17680
 */

class Solution {

    public int solution(int cacheSize, String[] cities) {

        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.contains(city)) {
                answer++;
                cache.remove(city);
                cache.add(city);
            } else {
                answer += 5;
                if (cache.size() == cacheSize) {
                    cache.remove(0);
                    cache.add(city);
                } else {
                    cache.add(city);
                }
            }
        }
        return answer;
    }
}