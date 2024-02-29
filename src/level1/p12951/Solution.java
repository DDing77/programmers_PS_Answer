package level1.p12951;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Author : DDing77
 * Problem Name: JadenCase 문자열 만들기
 * Level : 1
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12951
 */

public class Solution {

    public String solution(String s) {
        return Arrays.stream(s.split("\\b"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                .collect(Collectors.joining());
    }
}
