package level0.p120825;

import java.util.stream.Collectors;

/**
 * Author : DDing77
 * Problem Name: 문자 반복 출력하기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */

class Solution {

    public String solution(String my_string, int n) {

        return my_string.chars()
                .mapToObj(c -> String.valueOf((char) c).repeat(n))
                .collect(Collectors.joining());
    }
}