package level0.p181870;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : ad 제거하기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181870
 */

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(str -> !str.contains("ad")).toArray(String[]::new);
    }
}