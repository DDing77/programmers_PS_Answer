package level1.p81301;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : DDing77
 * Problem Name: 숫자 문자열과 영단어
 * Level : 1
 * Language : Java
 * Category : String, Hash
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

class Solution {

    static final Map<String, String> numbers = new HashMap<>();

    public void putData() {
        numbers.put("zero", "0");
        numbers.put("one", "1");
        numbers.put("two", "2");
        numbers.put("three", "3");
        numbers.put("four", "4");
        numbers.put("five", "5");
        numbers.put("six", "6");
        numbers.put("seven", "7");
        numbers.put("eight", "8");
        numbers.put("nine", "9");
    }

    public int solution(String s) {

        putData();

        for (String key : numbers.keySet()) {
            s = s.replaceAll(key, numbers.get(key));
        }

        return Integer.parseInt(s);
    }
}