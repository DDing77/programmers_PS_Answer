package level1.p12915;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 문자열 내 마음대로 정렬하기
 * Level : 1
 * Language : Java
 * Category : String, Sort
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */

public class Solution {

    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted((s1, s2) -> {
                    char c1 = s1.charAt(n);
                    char c2 = s2.charAt(n);

                    if (c1 != c2) {
                        return Character.compare(c1, c2);
                    } else {
                        return s1.compareTo(s2);
                    }
                })
                .toArray(String[]::new);
    }
}
